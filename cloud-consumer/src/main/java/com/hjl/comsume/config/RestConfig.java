package com.hjl.comsume.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Base64;
/**
 * Created   on 2018/11/3.
 *
 * @author hjl
 */
@Configuration
public class RestConfig {

    @Bean
   public HttpHeaders getHeader(){
       HttpHeaders header =  new HttpHeaders();
       String auth = "hello:hello";
       byte[] encodeauth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
       String authHeader = "Basic " + new String(encodeauth);
       header.set("Authorization", authHeader);
       return header;
   }

    @Bean
    @LoadBalanced
    public RestTemplate getrestTemplate() {
        return new RestTemplate();
    }

}

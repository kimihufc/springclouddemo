package com.hjl.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created   on 2018/11/3.
 *
 * @author hjl
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@ComponentScan("com.hjl.service")
@EnableFeignClients(basePackages={"com.hjl.service"})
public class ProvideStart {

    public static void main(String [] args){
        SpringApplication.run(ProvideStart.class,args);
    }

}

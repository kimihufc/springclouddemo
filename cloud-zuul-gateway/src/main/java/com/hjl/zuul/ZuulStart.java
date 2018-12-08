package com.hjl.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: HJL
 * @create: 2018-12-08 11:08
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulStart {

    public static void main(String [] args) {
        SpringApplication.run(ZuulStart.class,args);
//        http://gateway-9501.com:9501/cloud-provider/dept/list
    }
}

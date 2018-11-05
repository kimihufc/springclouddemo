package com.hjl.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created   on 2018/11/3.
 *
 * @author hjl
 */
@SpringBootApplication
@EnableEurekaClient
public class ProvideStart {

    public static void main(String [] args){
        SpringApplication.run(ProvideStart.class,args);
    }

}

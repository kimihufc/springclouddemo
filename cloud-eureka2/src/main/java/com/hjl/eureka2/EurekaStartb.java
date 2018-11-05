package com.hjl.eureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created   on 2018/11/4.
 *
 * @author hjl
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaStartb {

    public static void main(String [] args){
        SpringApplication.run(EurekaStartb.class,args);
    }

}

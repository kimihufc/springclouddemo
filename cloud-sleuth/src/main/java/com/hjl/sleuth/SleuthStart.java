package com.hjl.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author: HJL
 * @create: 2018-12-09 19:58
 */
@SpringBootApplication
@EnableZipkinServer
public class SleuthStart {

    public static void main(String [] args){
        SpringApplication.run(SleuthStart.class,args);
    }

}

package com.hjl.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: HJL
 * @create: 2018-12-08 17:26
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigStart {

    public static void main(String [] args){
        SpringApplication.run(ConfigStart.class,args);
//        http://config-7101.com:7101/application-dev.yml
//        http://config-7101.com:7101/application/dev/master
//        http://config-7101.com:7101/master/application-dev.yml
    }
}

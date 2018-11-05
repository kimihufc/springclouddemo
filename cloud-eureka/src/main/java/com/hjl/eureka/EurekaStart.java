package com.hjl.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created   on 2018/11/3.
 *
 * @author hjl
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStart.class, args);
    }
}

package com.hjl.comsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created   on 2018/11/3.
 *
 * @author hjl
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages={"com.hjl.service"})//进行接口IDeptClientService的扫描生成使得可以注入到ConsumerDeptController里面
public class ComsumeStart {

    public static void main(String[] args) {
        SpringApplication.run(ComsumeStart.class, args);
    }
}

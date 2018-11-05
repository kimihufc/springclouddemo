package com.hjl.comsume;

import com.hjl.comsume.config.MyLoadBalanceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created   on 2018/11/3.
 *
 * @author hjl
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="ribbonClient",configuration=MyLoadBalanceConfig.class)
public class ComsumeStart {

    public static void main(String[] args) {
        SpringApplication.run(ComsumeStart.class, args);
    }
}

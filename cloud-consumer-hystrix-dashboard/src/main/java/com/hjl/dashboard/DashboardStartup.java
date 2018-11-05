package com.hjl.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created   on 2018/11/4.
 *
 * @author hjl
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashboardStartup {

    public static void main(String [] agrs){
        SpringApplication.run(DashboardStartup.class,agrs);
    }

}

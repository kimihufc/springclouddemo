package com.hjl.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: HJL
 * @create: 2018-12-08 17:38
 */
@RestController
public class ConfigController {
    @Value("${spring.application.name}")
    private String applicationName; // 应用的服务名称
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers; // 设置所有的eureka服务信息项
    @RequestMapping("/config")
    public String getConfig() {
        return "ApplicationName = " + this.applicationName + "、EurekaServers = "
            + this.eurekaServers;
    }
}

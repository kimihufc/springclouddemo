package com.hjl.comsume.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * Created   on 2018/11/4.
 *
 * @author hjl
 */
public class MyLoadBalanceConfig {

    @Bean
    public IRule ribbonRule() { // 其中IRule就是所有规则的标准
        return new com.netflix.loadbalancer.RandomRule() ;
    }
}

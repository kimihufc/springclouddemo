package com.hjl.provider.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import javax.annotation.Resource;

/**
 * Created   on 2018/11/3.
 *
 * @author hjl
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 现在所写的安全处理类是在程序启动类的子包之中，应该可以自动扫描到
     *
     */


    @Resource
    public void configGlobal(AuthenticationManagerBuilder auth)
        throws Exception {
        auth.inMemoryAuthentication().withUser("hello").password("hello")
            .roles("USER").and().withUser("admin").password("hello")
            .roles("USER", "ADMIN");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 表示所有的访问都必须进行认证处理后才可以正常进行
        http.httpBasic().and().authorizeRequests().anyRequest()
            .fullyAuthenticated();
        // 所有的Rest服务一定要设置为无状态，以提升操作性能
        http.sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
}

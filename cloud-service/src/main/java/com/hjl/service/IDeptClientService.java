package com.hjl.service;

/**
 * Created   on 2018/11/4.
 *
 * @author hjl
 */

import com.hjl.bean.Dept;
import com.hjl.config.FeignClientConfig;
import com.hjl.factory.IDeptClientServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 通过注解@FeignClient添加接口对应的远程微服务名称value="MICROCLOUD-PROVIDER-DEPT"和
 * 服务的认证configuration=FeignClientConfig.class
 *
 */
@FeignClient(value="CLOUD-PROVIDER",configuration=FeignClientConfig.class,fallbackFactory = IDeptClientServiceFallbackFactory.class)
public interface IDeptClientService {
    @RequestMapping(method=RequestMethod.GET,value="/dept/get/{id}")
    public Dept get(@PathVariable("id") long id) ;
    @RequestMapping(method= RequestMethod.GET,value="/dept/list")
    public List<Dept> list() ;
    @RequestMapping(method=RequestMethod.POST,value="/dept/add")
    public boolean add(Dept dept) ;
}
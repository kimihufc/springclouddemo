package com.hjl.comsume.controller;

import com.hjl.bean.Dept;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created   on 2018/11/3.
 *
 * @author hjl
 */
@RestController
public class ConsumerDeptController {

    public static final String DEPT_GET_URL = "http://localhost:8001/dept/get/";
    public static final String DEPT_LIST_URL = "http://CLOUD-PROVIDER/dept/list/";
    public static final String DEPT_ADD_URL = "http://localhost8001/dept/add";
    //使用@Resource注解注入RestTemplate以后控制器就可以调用其他微服务了
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HttpHeaders headers;
    @Resource
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/consumer/dept/listhello")
    public Object listDepthello() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("CLOUD-PROVIDER") ;
        System.out.println(
            "【*** ServiceInstance ***】host = " + serviceInstance.getHost()
                + "、port = " + serviceInstance.getPort()
                + "、serviceId = " + serviceInstance.getServiceId());
        List<Dept> allDepts = this.restTemplate.exchange(DEPT_LIST_URL, HttpMethod.GET, new HttpEntity<Object>(this.headers), List.class).getBody();
        return allDepts;
    }
    @RequestMapping(value = "/consumer/dept/get")
    public Object getDept(long id) {
        Dept dept = this.restTemplate.getForObject(DEPT_GET_URL + id, Dept.class);
        return dept;
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public Object listDept() {
        List<Dept> allDepts = this.restTemplate.getForObject(DEPT_LIST_URL, List.class);
        return allDepts;
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object addDept(Dept dept) {
        Boolean flag = this.restTemplate.postForObject(DEPT_ADD_URL, dept, Boolean.class);
        return flag;
    }
}

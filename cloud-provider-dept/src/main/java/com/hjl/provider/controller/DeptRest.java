package com.hjl.provider.controller;

import com.hjl.bean.Dept;
import com.hjl.provider.service.IDeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created   on 2018/11/3.
 *
 * @author hjl
 */
@RestController
public class DeptRest {
    @Resource
    private IDeptService deptService ;
    @RequestMapping(value="/dept/get/{id}",method= RequestMethod.GET)
    public Object get(@PathVariable("id") long id) {
        return this.deptService.get(id) ;
    }
    @RequestMapping(value="/dept/add",method=RequestMethod.GET)
    public Object add(@RequestBody Dept dept) {
        return this.deptService.add(dept) ;
    }
    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    public Object list() {
        System.out.println("11111");
        return this.deptService.list() ;
    }
}

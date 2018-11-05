package com.hjl.provider.service;

import com.hjl.bean.Dept;

import java.util.List;

/**
 * Created   on 2018/11/3.
 *
 * @author hjl
 */
public interface IDeptService {
    public Dept get(long id) ;
    public boolean add(Dept dept) ;
    public List<Dept> list() ;
}

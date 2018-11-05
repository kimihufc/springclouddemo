package com.hjl.provider.dao;

import com.hjl.bean.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created   on 2018/11/3.
 *
 * @author hjl
 */
@Mapper
public interface IDeptDAO {
    public boolean doCreate(Dept vo) ;
    public Dept findById(Long id) ;
    public List<Dept> findAll() ;
}

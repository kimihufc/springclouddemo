package com.hjl.provider.service.impl;

import com.hjl.bean.Dept;
import com.hjl.provider.dao.IDeptDAO;
import com.hjl.provider.service.IDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created   on 2018/11/3.
 *
 * @author hjl
 */
@Service
public class DeptServiceImpl implements IDeptService {
    @Resource
    private IDeptDAO deptDAO ;
    @Override
    public Dept get(long id) {
        return this.deptDAO.findById(id);
    }

    @Override
    public boolean add(Dept dept) {
        return this.deptDAO.doCreate(dept);
    }

    @Override
    public List<Dept> list() {
        return this.deptDAO.findAll();
    }

}

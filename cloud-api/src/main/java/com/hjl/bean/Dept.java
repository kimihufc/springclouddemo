package com.hjl.bean;

import java.io.Serializable;

/**
 * Created   on 2018/11/3.
 *
 * @author hjl
 */
public class Dept implements Serializable {
    private Long deptno ;
    private String dname ;
    private String loc ;

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
            "deptno=" + deptno +
            ", dname='" + dname + '\'' +
            ", loc='" + loc + '\'' +
            '}';
    }
}

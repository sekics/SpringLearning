package com.portrait.dao;

import com.portrait.pojo.Emp;

import java.util.Map;

public interface EmpMapper {

    Emp getEmpByID(int id) ;
    int insertEmp(Emp emp) ;

    int updateEmp(Map<String,Object> map);
}

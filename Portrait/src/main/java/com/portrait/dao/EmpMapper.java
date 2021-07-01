package com.portrait.dao;

import com.portrait.pojo.Emp;

import java.util.Map;

public interface EmpMapper {

    Emp getEmpByID(String id) ;
    int insertEmp(Emp emp) ;
    int insertEmpMap(Map<String,Object> map) ;

    int updateEmp(Map<String,Object> map);
}

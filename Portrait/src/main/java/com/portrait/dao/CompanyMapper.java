package com.portrait.dao;

import com.portrait.pojo.Company;

import java.util.List;
import java.util.Map;

public interface CompanyMapper {
    List<Company> getCompanyList() ;
    Company getCompanyByName(String name) ;
    int insertCompany(Company company) ;

    //没实现
    int updateScore(Map<String,Object> map) ;
}

package com.portrait.dao;

import com.portrait.pojo.Res;

import java.util.List;
import java.util.Map;

public interface ResMapper {

    List<Res> getResList() ;
    List<Res> getResListByID(int eid) ;
    int insertRes(Res res) ;
    int insertResMap(Map<String,Object> map) ;
}

package com.portrait.Service;

import com.portrait.dao.EmpMapper;
import com.portrait.dao.ResMapper;
import com.portrait.dao.StandardMapper;
import com.portrait.utils.DisposeExcel;
import com.portrait.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StandardService {

    public void addStandard() throws Exception{
        String[] sheetNames = {"标准规程信息表","制度方案信息表"} ;
        List<Sheet> sheets = DisposeExcel.ReadExcel(sheetNames) ;
        int[] colsNeed = {1,2,3,5,6,12,13} ;
        String[] colNames = {"authorId","authorName","time","name","level","totalPerson","identityRank"} ;
        Map<Integer,String> map = new HashMap<Integer,String>() ;
        for( int i = 0 ; i < colsNeed.length ; i ++ ){
            map.put(colsNeed[i],colNames[i]) ;
        }
        for( int i = 0 ; i < sheets.size() ; i ++ ){
            Sheet sheet = sheets.get(i) ;
            int rowNumbers = sheet.getLastRowNum() + 1 ;
            Row temp = sheet.getRow(0);
            if( temp == null ){
                continue ;
            }

            SqlSession sqlSession = MybatisUtil.getSqlSession() ;
            StandardMapper standardMapper = sqlSession.getMapper(StandardMapper.class) ;
            EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class) ;

            for( int row = 2 ; row < rowNumbers ; row ++ ){
                Row r = sheet.getRow(row) ;
                Map<String,Object> item = new HashMap<String,Object>() ;
                for( int col = 0 ; col < colsNeed.length ; col ++ ){
                    String value = r.getCell(colsNeed[col]).toString() ;
                    item.put(map.get(colsNeed[col]),value) ;
                }
                if( empMapper.getEmpByID( (String)item.get("authorId")) == null ){
                    Map<String,Object> emp = new HashMap<String,Object>();
                    emp.put("id",item.get("authorId")) ;
                    emp.put("name",item.get("authorName")) ;
                    emp.put("score",null) ;
                    emp.put("time",new Date()) ;
                    emp.put("com",null) ;
                    empMapper.insertEmpMap(emp) ;
                }
                try{
                    standardMapper.insertStandardMap(item) ;
                }
                catch (Exception e){
                    continue ;
                }
            }
            sqlSession.commit();
            sqlSession.close();
        }
    }
}

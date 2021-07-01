package com.portrait.Service;

import com.portrait.dao.AcdemicContributionMapper;
import com.portrait.dao.EmpMapper;
import com.portrait.pojo.AcdemicContribution;
import com.portrait.pojo.Emp;
import com.portrait.utils.DisposeExcel;
import com.portrait.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AcdemicContributionService {

    public void AddAcdemicContribution() throws Exception{
        String[] sheetNames = {"论文著作信息表"} ;
        List<Sheet> sheets = DisposeExcel.ReadExcel(sheetNames) ;
        int[] colsNeed = {1,2,3,4,5,9,12,13} ;
        String[] colNames = {"authorId","authorName","time","type","name","pubType","totalPerson","identityRank"} ;
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
            AcdemicContributionMapper acdemicContributionMapper = sqlSession.getMapper(AcdemicContributionMapper.class) ;
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
                acdemicContributionMapper.addAcdemic(item) ;
            }
            sqlSession.commit();
            sqlSession.close();
        }
    }
}

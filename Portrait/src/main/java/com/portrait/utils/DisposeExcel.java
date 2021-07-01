package com.portrait.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.File;
import java.util.*;

public class DisposeExcel {


    public static List<Sheet> ReadExcel(String[] types) throws Exception{
        File xlsFile = new File("D:\\Code\\JavaCode\\IDEAPROJECT\\SpringLearning\\Portrait\\src\\main\\java\\com\\portrait\\utils\\information.xls") ;
        Workbook workbook = WorkbookFactory.create(xlsFile);


        List<String> sheetName = new ArrayList<String>() ;
        List<Sheet> res = new ArrayList<Sheet>() ;
        Map<String,List<String>> headerToCol = new HashMap<String,List<String>>() ;
//        String[] strs = {"成果获奖信息表","授权专利信息表","论文著作信息表","标准规范名称","制度方案信息表","课题研究信息表",
//                        "重大科技项目信息表","领衔作用信息表","重大项目信息表","其他技术报告信息表","项目任务信息表","工作促进信息表",
//                        "工作效益信息表","项目工程信息表"} ;
        Set<String> sheetToDispose = new HashSet<>();
        for( int i = 0 ; i < types.length ; i ++ ){
            sheetToDispose.add(types[i]) ;
        }

        // 表个数。
        int numberOfSheets = workbook.getNumberOfSheets();
        for (int i = 0; i < numberOfSheets; i++) {
            Sheet sheet = workbook.getSheetAt(i);

            // 行数。
            int rowNumbers = sheet.getLastRowNum() + 1 ;

            // Excel第一行。
            Row temp = sheet.getRow(0);
            if (temp == null) {
                continue;
            }

            int cells = temp.getPhysicalNumberOfCells();

            // 读数据。
            String header = "";
            for (int row = 0; row < rowNumbers; row++) {
                Row r = sheet.getRow(row);
                if( row == 0 ){
                    //获取表名
                    header = sheet.getRow(row).getCell(0).toString() ;
                    if( !sheetToDispose.contains(header)){
                        break ;
                    }
                    sheetName.add(header) ;
                    res.add(sheet) ;
                }
//                else if( row == 1 ){
//                    List<String> cols = new ArrayList<String>() ;
//                    for( int col = 0 ; col < cells ; col ++ ){
//                        colName = r.getCell(col).toString() ;
//                        cols.add(colName) ;
//                    }
//                    headerToCol.put(header,cols) ;
//                }
//                for (int col = 0; col < cells; col++) {
//                    System.out.print(r.getCell(col).toString()+" ");
//                }

                // 换行。
//                System.out.println();
            }
        }
        return res ;
    }

}

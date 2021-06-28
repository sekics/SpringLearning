package seki.spring.utils;

import org.junit.Test;

import java.util.UUID;

//自动生成ID
public class IDutil {

    public static String getID(){
        return UUID.randomUUID().toString().replaceAll("-","") ;
    }

    @Test
    public void test(){
        System.out.println(IDutil.getID()) ;
    }
}

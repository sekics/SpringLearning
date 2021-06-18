package com.seki.spring.bean;

public class Emp {
    private String eName ;
    private String eGender ;
    private Dept eDept ;

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender;
    }

    public void seteDept(Dept eDept){
        this.eDept = eDept ;
    }
}

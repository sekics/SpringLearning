package com.seki.spring;

public class Order {
    private String oName ;
    private String oAddress ;

    public Order(String oName,String oAddress){
        this.oName = oName ;
        this.oAddress = oAddress ;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oName='" + oName + '\'' +
                ", oAddress='" + oAddress + '\'' +
                '}';
    }
}

package seki.spring.collection.bean;

public class Order {
    private String oName ;

    public Order(){
        System.out.println("execute non-parameter constructor") ;
    }
    public void setoName(String oName) {
        this.oName = oName;
        System.out.println("Call the setter to assign value to the attributes") ;
    }

    //创建执行的初始化方法
    public void initMethod(){
        System.out.println("init method") ;
    }

    public void destroyMethod(){
        System.out.println("destroy method") ;
    }
}

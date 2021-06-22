package seki.spring.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {

    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class} ;
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override 匿名内部类实现
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        }) ;
        UserDao userDao = new UserDaoImpl() ;
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new UserProxy(userDao)) ;
        int res = dao.add(1,2) ;
        System.out.println(res) ;
        dao.update("Seki") ;
    }
}

class UserProxy implements  InvocationHandler{

    Object obj ;
    //传入被代理对象
    //1、有参构造传入
    public UserProxy(Object obj){
        this.obj = obj ;
    }
    //增强的部分
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method:" + method.getName()) ;

        //被增强的方法
        Object res = method.invoke(obj,args) ;

        System.out.println("After method:") ;
        return res;
    }
}
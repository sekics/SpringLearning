package seki.spring.collection.factorybean;

import org.springframework.beans.factory.FactoryBean;
import seki.spring.collection.Course;

public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course = new Course() ;
        course.setCourseName("Java");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}

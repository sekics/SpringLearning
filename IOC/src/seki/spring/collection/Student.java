package seki.spring.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Student {
    //Arrays
    private String[] courses ;

    //List
    private List<String> list ;

    //Map
    private Map<String,String> map;

    //Set
    private Set<String> set ;

    private List<Course> courseList ;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", courseList=" + courseList +
                '}';
    }
}

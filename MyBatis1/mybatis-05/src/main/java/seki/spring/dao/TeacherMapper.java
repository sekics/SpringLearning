package seki.spring.dao;

import seki.spring.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeachers() ;
    /*Teacher getTeacherById(int id) ;*/
}

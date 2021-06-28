package seki.spring.dao;

import seki.spring.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeacherList() ;
    Teacher getTeacherById(int tid) ;
    Teacher getTeacherById2(int tid) ;
}

package com.cs.dao.student;

import java.util.List;

import com.cs.pojo.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer studentno);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByStudentNo(Integer studentno);
    

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
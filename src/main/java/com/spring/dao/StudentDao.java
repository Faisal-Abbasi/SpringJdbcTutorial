package com.spring.dao;

import com.spring.entities.Student;

public interface StudentDao {
    int insert(Student student);
    int update(Student student);

    int delete(Student student);

}

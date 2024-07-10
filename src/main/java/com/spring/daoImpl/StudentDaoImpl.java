package com.spring.daoImpl;

import com.spring.dao.StudentDao;
import com.spring.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Student student) {
        System.out.println("Inserting data into databases");
        String query= "insert into student(id,name,city) values (?,?,?)";
        return jdbcTemplate.update(query, student.getId(),student.getName(),student.getCity());
    }

    @Override
    public int update(Student student) {
        System.out.println("updating the database value");
        String query="update student set name=?, city=? where id=?";
        return this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
    }

    @Override
    public int delete(Student student) {
        System.out.println("Deleting a row from table");
        String query="delete from student where id=?";
        return this.jdbcTemplate.update(query,student.getId());


    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}

package com.spring.springjdbc;

import com.spring.daoImpl.StudentDaoImpl;
import com.spring.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc.xml");
        StudentDaoImpl studentDao=context.getBean("StudentDaoImpl",StudentDaoImpl.class);
        Student s=new Student();
        s.setId(243);
        s.setName("Shivam");
        s.setCity("Jhansi");
      // int result= studentDao.insert(s);
       // int result= studentDao.update(s);
        int result= studentDao.delete(s);
        System.out.println("data has been successfully inserted into the databases");
    }
}

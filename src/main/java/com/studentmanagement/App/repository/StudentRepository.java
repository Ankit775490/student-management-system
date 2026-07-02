package com.studentmanagement.App.repository;

import com.studentmanagement.App.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByName(String name);
    List<Student> findByCourse(String course);
    List<Student> findByNameAndCourse(String name,String course);
    List<Student> findByAgeLessThan(Integer age);
    List<Student> findByAgeGreaterThan(Integer age);
    List<Student> findByCourseContaining(String course);
    List<Student> findByNameStartingWith(String name);
    List<Student> findByNameEndingWith(String name);

}

package com.studentmanagement.App.service;

import com.studentmanagement.App.Entity.Student;
import com.studentmanagement.App.Exception.StudentNotFoundException;
import com.studentmanagement.App.repository.StudentRepository;
import org.hibernate.collection.internal.StandardIdentifierBagSemantics;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class StudentService {
    private final StudentRepository repository;
    public StudentService (StudentRepository repository){
        this.repository=repository;
    }
    public Student SaveStudent(Student student){
        return repository.save(student);
    }

    public List<Student> getAllStudent (){
        return repository.findAll();
    }

    public Student getStudentById(Long id){
        return repository.findById(id).orElseThrow(() ->
                new StudentNotFoundException("Student Not Found with ID : " + id));
    }

    public Student updateStudent(Long id, Student updatedStudent) {

        Student existingStudent = repository.findById(id)
                .orElseThrow(() ->
                        new StudentNotFoundException("Student Not Found with ID : " + id));

        if (existingStudent != null) {

            existingStudent.setName(updatedStudent.getName());
            existingStudent.setCourse(updatedStudent.getCourse());
            existingStudent.setCity(updatedStudent.getCity());
            existingStudent.setAge(updatedStudent.getAge());

            return repository.save(existingStudent);
        }

        return null;
    }

    public String  DeleteStudent(Long id){
         repository.deleteById(id);
         return "student delete successfully";
    }

    public List<Student> getStudentByName(String name){
        return repository.findByName(name);
    }

    public List<Student> getStudentByCourse(String course){
        return repository.findByCourse(course);
    }

    public List<Student> getStudentNameAndCourse(String name ,String course){
        return repository.findByNameAndCourse(name,course);

    }

    public List<Student> getStudentAgeLessThan(@PathVariable Integer age){
        return repository.findByAgeLessThan(age);
    }
}

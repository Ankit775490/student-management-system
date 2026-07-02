package com.studentmanagement.App.controller;

import com.studentmanagement.App.Entity.Student;
import com.studentmanagement.App.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Students")
public class StudentController {
    private final StudentService service;
    public StudentController (StudentService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student){

        Student savedStudent = service.SaveStudent(student);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedStudent);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){

        return ResponseEntity.ok(service.getAllStudent());
    }



    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent( @Valid @PathVariable Long id){

        Student student = service.getStudentById(id);

        if(student != null){
            return ResponseEntity.ok(student);
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(
            @PathVariable Long id,
            @RequestBody Student student){

        Student updatedStudent = service.updateStudent(id, student);

        if(updatedStudent != null){
            return ResponseEntity.ok(updatedStudent);
        }

        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@Valid @PathVariable Long id){

        String message = service.DeleteStudent(id);

        if(message.equals("Deleted Successfully")){
            return ResponseEntity.ok(message);
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<Student>> getStudentByName(
            @PathVariable String name){

        return ResponseEntity.ok(service.getStudentByName(name));

    }

    @GetMapping("/course/{course}")
    public ResponseEntity<List<Student>> Bycourse(@PathVariable String course){
        return ResponseEntity.ok(service.getStudentByCourse(course));
    }

    @GetMapping("/search")
    public ResponseEntity<List<Student>> getnameAndcourse( @RequestParam String name,@RequestParam String course){
        return ResponseEntity.ok(service.getStudentNameAndCourse(name,course));
    }

    @GetMapping("/age/{age}")
    public ResponseEntity<List<Student>> getStudentAgeLessThan(@PathVariable Integer age){
        return ResponseEntity.ok(service.getStudentAgeLessThan(age));
    }
}

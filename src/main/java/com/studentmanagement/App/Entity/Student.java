package com.studentmanagement.App.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Course is required")
    private String course;
    @NotBlank(message = "city is required")
    private String city;
    @Setter
    @Getter
    @NotNull
    private Integer age;

    public Student() {
    }
    public Student(Long id, String name, String course, String city,Integer age) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.city = city;
        this.age = age;
    }
}

package com.example.demo.entity;

import com.example.demo.emuns.Grade;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "name required")
    @Column(nullable = false)
    private String name;

    @NotNull(message = "subjects required")
    @Column(nullable = false)
    private List<Subject> subjects;

    @NotNull(message = "grade required")
    @Column(nullable = false)
    private Grade grade;
}

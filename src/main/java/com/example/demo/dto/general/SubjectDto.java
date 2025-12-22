package com.example.demo.dto.general;

import com.example.demo.emuns.Grade;
import com.example.demo.emuns.Semester;


public record SubjectDto(
        Long id,
        String name,
        Semester semester,
        Grade grade
) {}

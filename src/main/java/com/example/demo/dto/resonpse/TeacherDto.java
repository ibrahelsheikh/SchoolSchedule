package com.example.demo.dto.resonpse;

import com.example.demo.emuns.Grade;
import com.example.demo.entity.Subject;

import java.util.List;

public record TeacherDto(
        Long id,
        String name,
        List<Subject> subjects,
        List<Grade> grades

) {
}

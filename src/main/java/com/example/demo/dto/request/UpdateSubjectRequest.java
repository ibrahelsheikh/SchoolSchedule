package com.example.demo.dto.request;

import com.example.demo.emuns.Grade;
import com.example.demo.emuns.Semester;


public record UpdateSubjectRequest(
        String name,
        Semester semester,
        Grade grade
) {
}

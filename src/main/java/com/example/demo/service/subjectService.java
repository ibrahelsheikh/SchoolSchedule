package com.example.demo.service;

import com.example.demo.dto.request.CreateSubjectRequest;
import com.example.demo.entity.Teacher;

public interface subjectService {
    Teacher createSubject(CreateSubjectRequest createSubjectRequest);
}

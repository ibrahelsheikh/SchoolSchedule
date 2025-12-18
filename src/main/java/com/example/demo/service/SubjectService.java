package com.example.demo.service;

import com.example.demo.dto.request.CreateSubjectRequest;
import com.example.demo.dto.resonpse.GetAllSubjectsResponse;
import com.example.demo.entity.Teacher;

public interface SubjectService {
    Long createSubject(CreateSubjectRequest createSubjectRequest);
    GetAllSubjectsResponse getAllSubjects();
}

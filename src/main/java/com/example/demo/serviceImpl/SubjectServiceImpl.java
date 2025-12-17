package com.example.demo.serviceImpl;

import com.example.demo.dto.request.CreateSubjectRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl {
    public Long createSubject(@Valid CreateSubjectRequest createSubjectRequest) {
        return null;
    }
}

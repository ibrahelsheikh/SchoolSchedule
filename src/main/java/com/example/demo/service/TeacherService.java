package com.example.demo.service;


import com.example.demo.dto.request.CreateTeacherRequest;

import java.util.List;


public interface TeacherService {
    Long createTeacher(CreateTeacherRequest createTeacherRequest);
    List<Long> getAllTeachers();

}


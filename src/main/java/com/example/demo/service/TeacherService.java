package com.example.demo.service;


import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.dto.resonpse.GetAllTeachersResponse;


public interface TeacherService {
    Long createTeacher(CreateTeacherRequest createTeacherRequest);
    GetAllTeachersResponse getAllTeachers();
    void deleteTeacher(Long teacherId);

}

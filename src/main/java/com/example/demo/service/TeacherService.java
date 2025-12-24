package com.example.demo.service;


import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.dto.resonpse.GetAllTeachersResponse;
import com.example.demo.entity.Teacher;


public interface TeacherService {
    Long createTeacher(CreateTeacherRequest createTeacherRequest);
    GetAllTeachersResponse getAllTeachers();
    void deleteTeacher(Long teacherId);

    Teacher updateTeacher(Long teacherId, CreateTeacherRequest createTeacherRequest);

}

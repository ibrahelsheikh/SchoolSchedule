package com.example.demo.controller;

import com.example.demo.dto.request.CreateSubjectRequest;
import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class home {

    private final TeacherService teacherService;

    @PostMapping("/addNewTeacher")
    public ResponseEntity<Teacher> CreateTeacher(
            @Valid @RequestBody CreateTeacherRequest createTeacherRequest

    ) {
        Teacher savedTeacher = teacherService.createTeacher(createTeacherRequest);
        return new ResponseEntity<>(savedTeacher, HttpStatus.CREATED);
    }


    @PostMapping("/addNewSubject")
    public ResponseEntity<Teacher> createSubject(
            @Valid @RequestBody CreateSubjectRequest createSubjectRequest
    ) {
        Teacher updatedTeacher = teacherService.createSubject(createSubjectRequest);
        return new ResponseEntity<>(updatedTeacher, HttpStatus.OK);
    }


}

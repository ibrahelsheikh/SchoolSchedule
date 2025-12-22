package com.example.demo.dto.resonpse;

import com.example.demo.dto.general.TeacherDto;

import java.util.List;

public record GetAllTeachersResponse(
        List<TeacherDto> teachers
) {
}

package com.example.demo.dto.resonpse;

import java.util.List;

public record GetAllTeachersResponse(
        List<TeacherDto> teachers
) {
}

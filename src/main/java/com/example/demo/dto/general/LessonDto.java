package com.example.demo.dto.general;

import java.time.LocalTime;

public record LessonDto(
        Long id,
        LocalTime startTime,
        LocalTime endTime,
        Long subjectId,
        Long teacherId
){
}

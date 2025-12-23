package com.example.demo.dto.general;

public record LessonDto(
        Long id,
        Long startTime,
        Long endTime,
        Long subjectId,
        Long teacherId
){
}

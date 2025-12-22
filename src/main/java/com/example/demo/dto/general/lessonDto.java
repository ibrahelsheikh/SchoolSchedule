package com.example.demo.dto.general;

public record lessonDto (
        Long id,
        Long startTime,
        Long endTime,
        Long subjectId,
        Long teacherId
){
}

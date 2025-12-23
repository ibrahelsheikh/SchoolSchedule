package com.example.demo.dto.general;


import java.time.DayOfWeek;
import java.util.List;

public record DaySchedulerDto(
        DayOfWeek dayOfWeek,
        List<LessonDto> lessons

) {
}

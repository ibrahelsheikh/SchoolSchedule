package com.example.demo.dto.general;


import java.time.DayOfWeek;
import java.util.List;

public record daySchedulerDto(
        DayOfWeek dayOfWeek,
        List<lessonDto> lessons

) {
}

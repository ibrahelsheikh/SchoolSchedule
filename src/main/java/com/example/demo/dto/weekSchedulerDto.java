package com.example.demo.dto;

import com.example.demo.dto.general.DaySchedulerDto;

import java.util.List;

public record weekSchedulerDto (
        List<DaySchedulerDto> days

){
}

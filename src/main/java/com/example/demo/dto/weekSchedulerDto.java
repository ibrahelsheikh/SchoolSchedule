package com.example.demo.dto;

import com.example.demo.dto.general.daySchedulerDto;

import java.util.List;

public record weekSchedulerDto (
        List<daySchedulerDto> days

){
}

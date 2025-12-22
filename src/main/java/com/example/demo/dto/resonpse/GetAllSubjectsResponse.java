package com.example.demo.dto.resonpse;


import com.example.demo.dto.general.SubjectDto;

import java.util.List;

public record GetAllSubjectsResponse (
        List<SubjectDto> subjects
){
}

package com.example.demo.dto.request;


import com.example.demo.emuns.Grade;
import lombok.Builder;
import lombok.Data;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@Builder
public class CreateTeacherRequest {

    private Long id;

    @NotNull(message = "teacher name required")

    private String name;

    private List<CreateSubjectRequest> subjects;


    @NotNull(message = "grade required")
    private Grade grade;

}

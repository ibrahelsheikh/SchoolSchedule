package com.example.demo.dto.general;

import com.example.demo.emuns.Grade;

public record RoomDto(
        Long id,
        int classNumber,
        Grade grade

) {
}

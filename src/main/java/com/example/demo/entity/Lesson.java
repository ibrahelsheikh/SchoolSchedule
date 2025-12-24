package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Data
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalTime startTime;

    @Column(nullable = false)
    private LocalTime endTime;

    @Column(nullable = false)
    private Long subjectId; // You can replace with @ManyToOne if Subject entity exists

    @Column(nullable = false)
    private Long teacherId; // You can replace with @ManyToOne if Teacher entity exists

    // Many lessons belong to one day
    @ManyToOne
    @JoinColumn(name = "day_schedule_id")
    private DaySchedule daySchedule;

}

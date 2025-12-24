package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.DayOfWeek;
import java.util.List;

@Entity
@Data
public class DaySchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // Day of the week (MONDAY, TUESDAY, etc.)
    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;

    // Many DaySchedules belong to one WeeklySchedule
    @ManyToOne
    @JoinColumn(name = "weekly_schedule_id")
    private WeeklySchedule weeklySchedule;

    // One day can have multiple lessons
    @OneToMany(mappedBy = "daySchedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Lesson> lessons;

}

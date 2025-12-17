package com.example.demo.serviceImpl;

import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.entity.Teacher;
import com.example.demo.repository.SubjectRepository;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.TeacherService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;
    private final SubjectRepository subjectRepository;

    @Override
    public Long createTeacher(@Valid CreateTeacherRequest createTeacherRequest) {
        // Fetch subjects by IDs
        var subjects = subjectRepository.findAllById(createTeacherRequest.getSubjectIds());

        // Map DTO to entity
        Teacher teacher = new Teacher();
        teacher.setName(createTeacherRequest.getName());
        teacher.setSubjects(subjects);
        teacher.setGrades(createTeacherRequest.getGrades()); // List<Grade>

        // Save teacher
        Teacher savedTeacher = teacherRepository.save(teacher);

        // Return generated ID
        return savedTeacher.getId();
    }

    @Override
    public List<Long> getAllTeachers() {
        return teacherRepository.findAll()
                .stream()
                .map(Teacher::getId)
                .collect(Collectors.toList());
    }
}

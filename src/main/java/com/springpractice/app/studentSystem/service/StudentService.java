package com.springpractice.app.studentSystem.service;

import com.springpractice.app.studentSystem.dto.AddStudentRequestDto;
import com.springpractice.app.studentSystem.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);
}

package service;

package com.example.universityeventmanagement.service;

import com.example.universityeventmanagement.model.Department;
import com.example.universityeventmanagement.model.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    Student updateStudentDepartment(Long studentId, Department department);
    void deleteStudent(Long studentId);
    List<Student> getAllStudents();
    Student getStudentById(Long studentId);
}

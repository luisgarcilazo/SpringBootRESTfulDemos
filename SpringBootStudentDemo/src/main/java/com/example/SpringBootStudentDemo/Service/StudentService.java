package com.example.SpringBootStudentDemo.Service;

import com.example.SpringBootStudentDemo.Entity.Student;

import java.util.List;
public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentByID(int studentID);

    Student addStudent(Student student);

    Student updateStudent(Student student);

    String deleteStudentById(int studentID);
}

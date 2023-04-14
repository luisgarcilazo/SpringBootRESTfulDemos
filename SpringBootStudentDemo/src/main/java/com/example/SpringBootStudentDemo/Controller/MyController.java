package com.example.SpringBootStudentDemo.Controller;


import com.example.SpringBootStudentDemo.Entity.Student;
import com.example.SpringBootStudentDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String home(){
        return "<HTML><H1>Welcome to my Student Application</H1></HTML>";
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    }

    @GetMapping("/students/{studentID}")
    public Student getStudent(@PathVariable String studentID){
        return this.studentService.getStudentByID(Integer.parseInt(studentID));
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return this.studentService.addStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        return this.studentService.updateStudent(student);
    }

    @DeleteMapping("/students/{studentID}")
    public String deleteStudent(@PathVariable String studentID){
        return this.studentService.deleteStudentById(Integer.parseInt(studentID));
    }
}

package com.example.SpringBootStudentDemo.Service;

import com.example.SpringBootStudentDemo.Dao.StudentDao;
import com.example.SpringBootStudentDemo.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> getAllStudents() {
        return this.studentDao.findAll();
    }

    @Override
    public Student getStudentByID(int studentID) {
        Optional<Student> s = this.studentDao.findById(studentID);
        Student student = null;
        if(s.isPresent()){
            student = s.get();
            return student;
        } else {
            throw new RuntimeException("Student not found for id :: " + studentID);
        }
    }

    @Override
    public Student addStudent(Student student) {
        return this.studentDao.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return this.studentDao.save(student);
    }

    @Override
    public String deleteStudentById(int studentID) {
        this.studentDao.deleteById(studentID);
        return "Deleted succesfully!";
    }
}

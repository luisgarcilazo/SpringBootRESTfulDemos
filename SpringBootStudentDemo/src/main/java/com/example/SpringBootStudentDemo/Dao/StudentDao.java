package com.example.SpringBootStudentDemo.Dao;
import com.example.SpringBootStudentDemo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}

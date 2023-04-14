package com.example.SpringBootCustomerDemo.Repository;

import com.example.SpringBootCustomerDemo.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {

    @Query(value= "Select * from tbl_customers phone_number = ?1", nativeQuery=true)
    List<Customer> getCourseDetails(String autName);
}

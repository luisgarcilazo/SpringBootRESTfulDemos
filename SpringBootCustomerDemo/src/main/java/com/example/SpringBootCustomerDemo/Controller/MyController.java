package com.example.SpringBootCustomerDemo.Controller;


import com.example.SpringBootCustomerDemo.Entity.Customer;
import com.example.SpringBootCustomerDemo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String home(){
        return "<HTML><H1>Welcome to my Customer Application</H1></HTML>";
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return this.customerService.getAllCustomers();
    }

    @GetMapping("/customers/{customerID}")
    public Customer getCustomer(@PathVariable String customerID){
        return this.customerService.getCustomerById(Integer.parseInt(customerID));
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer){
        return this.customerService.addCustomer(customer);
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer customer){
        return this.customerService.updateCustomer(customer);
    }

    @DeleteMapping("/customers/{customerID}")
    public String deleteCustomer(@PathVariable String customerID){
        return this.customerService.deleteCustomerById(Integer.parseInt(customerID));
    }
}

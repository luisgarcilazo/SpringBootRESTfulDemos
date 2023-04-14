package com.example.SpringBootCustomerDemo.Service;

import com.example.SpringBootCustomerDemo.Entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer getCustomerById(int customerID);

    Customer addCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    String deleteCustomerById(int customerID);
}

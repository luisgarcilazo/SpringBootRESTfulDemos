package com.example.SpringBootCustomerDemo.Service;

import com.example.SpringBootCustomerDemo.Entity.Customer;
import com.example.SpringBootCustomerDemo.Repository.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;
    @Override
    public List<Customer> getAllCustomers() {
        return this.customerDao.findAll();
    }

    @Override
    public Customer getCustomerById(int customerID) {
        Optional<Customer> c = this.customerDao.findById(customerID);
        Customer customer = null;
        if(c.isPresent()){
            customer = c.get();
            return customer;
        } else {
            throw new RuntimeException("Customer not found for id :: " + customerID);
        }
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return this.customerDao.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return this.customerDao.save(customer);
    }

    @Override
    public String deleteCustomerById(int customerID) {
        this.customerDao.deleteById(customerID);
        return "Deleted successfully!";
    }
}

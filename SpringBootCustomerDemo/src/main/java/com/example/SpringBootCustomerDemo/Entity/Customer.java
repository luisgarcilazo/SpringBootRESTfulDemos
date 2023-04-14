package com.example.SpringBootCustomerDemo.Entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_customers")
public class Customer {

    @Id
    @Column(name = "cst_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerid;

    private String name;

    private String phone;

    private String address;

    public Customer(){
    }

    public Customer(int customerid, String name, String phone, String address){
        this.customerid = customerid;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

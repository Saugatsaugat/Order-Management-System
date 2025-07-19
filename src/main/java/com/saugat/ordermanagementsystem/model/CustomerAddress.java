package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_address")
public class CustomerAddress extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public CustomerAddress() {
    }

    public CustomerAddress(Customer customer, Address address) {
        this.customer = customer;
        this.address = address;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

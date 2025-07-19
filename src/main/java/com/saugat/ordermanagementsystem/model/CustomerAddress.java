package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "customer_address")
public class CustomerAddress extends AbstractEntity {

    @NotNull(message = "Customer can not be null")
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @NotNull(message = "Address can not be null")
    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
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

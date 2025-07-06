package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "customer")
public class Customer extends AbstractEntity {

    @Column(name = "company_name")
    private String companyName;
    @Column(name = "contact_name")
    private String contactName;
    @Column(name = "phone", length = 15, unique = true)
    private String phone;
    @OneToOne
    private Address address;

    public Customer() {
    }

    public Customer(String companyName, String contactName, String phone, Address address) {
        this.companyName = companyName;
        this.contactName = contactName;
        this.phone = phone;
        this.address = address;
    }

    public Customer(Long id, String companyName, String contactName, String phone, Address address) {
        super.setId(id);
        this.companyName = companyName;
        this.contactName = contactName;
        this.phone = phone;
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(companyName, customer.companyName) && Objects.equals(contactName, customer.contactName) && Objects.equals(phone, customer.phone) && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, contactName, phone, address);
    }

    @Override
    public String toString() {
        return "id: " + super.getId();
    }
}


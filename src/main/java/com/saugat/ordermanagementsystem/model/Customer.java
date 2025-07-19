package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table(name = "customer")
public class Customer extends AbstractEntity {

    @Column(name = "company_name")
    private String companyName;
    @Column(name = "contact_name")
    private String contactName;
    @NotNull(message = "Customer phone can not be null")
    @Column(name = "phone", length = 15, unique = true, nullable = false)
    private String phone;

    public Customer() {
    }

    public Customer(String companyName, String contactName, String phone) {
        this.companyName = companyName;
        this.contactName = contactName;
        this.phone = phone;
    }

    public Customer(Long id, String companyName, String contactName, String phone, Address address) {
        super.setId(id);
        this.companyName = companyName;
        this.contactName = contactName;
        this.phone = phone;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(companyName, customer.companyName) && Objects.equals(contactName, customer.contactName) && Objects.equals(phone, customer.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, contactName, phone);
    }

    @Override
    public String toString() {
        return "id: " + super.getId();
    }
}


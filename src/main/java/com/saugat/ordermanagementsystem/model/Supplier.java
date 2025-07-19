package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table(name="supplier")
public class Supplier extends AbstractEntity{

    @NotNull(message = "Company name can not be null")
    @Column(name="company_name", nullable = false)
    private String companyName;
    @NotNull(message = "Contact name can not be null")
    @Column(name="contact_name")
    private String contactName;
    @NotNull(message = "Supplier Phone number can not be null")
    @Column(name="phone", length=15, unique = true, nullable = false)
    private String phone;
    @Column(name = "country", length=100)
    private String country;
    @NotNull(message = "Address can not be null")
    @OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    public Supplier() {
    }

    public Supplier(String companyName, String contactName, String phone, String country, Address address) {
        this.companyName = companyName;
        this.contactName = contactName;
        this.phone = phone;
        this.country = country;
        this.address = address;
    }

    public Supplier(Long id, String companyName, String contactName, String phone, String country, Address address) {
        super.setId(id);
        this.companyName = companyName;
        this.contactName = contactName;
        this.phone = phone;
        this.country = country;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddressId(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(companyName, supplier.companyName) && Objects.equals(contactName, supplier.contactName) && Objects.equals(phone, supplier.phone) && Objects.equals(country, supplier.country) && Objects.equals(address, supplier.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, contactName, phone, country, address);
    }

    @Override
    public String toString() {
        return "id: "+ super.getId();
    }
}

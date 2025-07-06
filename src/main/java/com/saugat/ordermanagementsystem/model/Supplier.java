package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="supplier")
public class Supplier extends AbstractEntity{

    @Column(name="company_name")
    private String companyName;
    @Column(name="contact_name")
    private String contactName;
    @Column(name="phone", length=15, unique = true)
    private String phone;
    @Column(name = "country", length=100)
    private String country;
    @OneToOne
    @JoinColumn(name = "address_id", nullable = true)
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

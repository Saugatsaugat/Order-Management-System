package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "shipper")
public class Shipper extends AbstractEntity {

    @Column(name = "company_name", nullable = false)
    private String companyName;
    @Column(name="phone")
    private String phone;

    public Shipper() {
    }

    public Shipper(String companyName, String phone) {
        this.companyName = companyName;
        this.phone = phone;
    }

    public Shipper(Long id, String companyName, String phone) {
        super.setId(id);
        this.companyName = companyName;
        this.phone = phone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
        Shipper shipper = (Shipper) o;
        return Objects.equals(companyName, shipper.companyName) && Objects.equals(phone, shipper.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, phone);
    }

    @Override
    public String toString() {
        return "id: "+ super.getId();
    }
}

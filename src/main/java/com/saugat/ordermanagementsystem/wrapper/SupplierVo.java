package com.saugat.ordermanagementsystem.wrapper;

import org.springframework.stereotype.Component;

@Component
public class SupplierVo extends AbstractEntityVo{

    private String companyName;
    private String contactName;
    private String phone;
    private String country;
    private AddressVo address;

    public SupplierVo() {
    }

    public SupplierVo(Long id, String companyName, String contactName, String phone, String country, AddressVo address) {
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

    public AddressVo getAddress() {
        return address;
    }

    public void setAddress(AddressVo address) {
        this.address = address;
    }
}

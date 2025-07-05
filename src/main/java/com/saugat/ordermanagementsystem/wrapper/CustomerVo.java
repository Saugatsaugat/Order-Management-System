package com.saugat.ordermanagementsystem.wrapper;

import org.springframework.stereotype.Component;

@Component
public class CustomerVo extends AbstractEntityVo {

    private String companyName;
    private String contactName;
    private String phone;
    private AddressVo address;

    public CustomerVo() {
    }

    public CustomerVo(Long id, String companyName, String contactName, String phone, AddressVo address) {
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

    public AddressVo getAddress() {
        return address;
    }

    public void setAddress(AddressVo address) {
        this.address = address;
    }
}

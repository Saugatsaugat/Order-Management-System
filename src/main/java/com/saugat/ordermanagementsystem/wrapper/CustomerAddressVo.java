package com.saugat.ordermanagementsystem.wrapper;

import org.springframework.stereotype.Component;

@Component
public class CustomerAddressVo extends AbstractEntityVo{
    private CustomerVo customer;
    private AddressVo address;

    public CustomerAddressVo() {
    }

    public CustomerAddressVo(CustomerVo customer, AddressVo address) {
        this.customer = customer;
        this.address = address;
    }

    public CustomerVo getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerVo customer) {
        this.customer = customer;
    }

    public AddressVo getAddress() {
        return address;
    }

    public void setAddress(AddressVo address) {
        this.address = address;
    }
}

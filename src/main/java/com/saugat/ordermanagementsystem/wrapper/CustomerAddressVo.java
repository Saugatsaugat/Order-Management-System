package com.saugat.ordermanagementsystem.wrapper;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
public class CustomerAddressVo extends AbstractEntityVo{
    @NotNull(message = "Customer can not be null")
    private CustomerVo customer;

    @NotNull(message = "Address can not be null")
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

package com.saugat.ordermanagementsystem.wrapper;

import org.springframework.stereotype.Component;

@Component
public class EmployeeAddressVo extends AbstractEntityVo {
    private EmployeeVo employee;
    private AddressVo address;

    public EmployeeAddressVo() {
    }

    public EmployeeAddressVo(EmployeeVo employee, AddressVo address) {
        this.employee = employee;
        this.address = address;
    }

    public EmployeeVo getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeVo employee) {
        this.employee = employee;
    }

    public AddressVo getAddress() {
        return address;
    }

    public void setAddress(AddressVo address) {
        this.address = address;
    }
}

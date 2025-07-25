package com.saugat.ordermanagementsystem.wrapper;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
public class EmployeeAddressVo extends AbstractEntityVo {

    @NotNull(message = "Employee can not be null")
    private EmployeeVo employee;

    @NotNull(message = "Address can not be null")
    private AddressVo address;

    public EmployeeAddressVo() {
    }

    public EmployeeAddressVo(EmployeeVo employee, AddressVo address) {
        this.employee = employee;
        this.address = address;
    }

    public EmployeeAddressVo(Long id, EmployeeVo employee, AddressVo address) {
        super.setId(id);
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

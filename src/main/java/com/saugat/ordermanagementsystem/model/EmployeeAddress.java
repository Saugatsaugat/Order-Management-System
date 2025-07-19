package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="employee_address")
public class EmployeeAddress extends AbstractEntity{

    @NotNull(message = "Employee can not be null")
    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;
    @NotNull(message = "Address can not be null")
    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    public EmployeeAddress() {
    }

    public EmployeeAddress(Employee employee, Address address) {
        this.employee = employee;
        this.address = address;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

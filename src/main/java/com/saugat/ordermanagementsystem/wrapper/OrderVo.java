package com.saugat.ordermanagementsystem.wrapper;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class OrderVo extends AbstractEntityVo {

    private LocalDate orderDate;
    private LocalDate requireDate;
    private LocalDate shippedDate;
    private String shipVia;
    private AddressVo shipAddress;
    private CustomerVo customer;
    private EmployeeVo employee;

    public OrderVo() {
    }

    public OrderVo(Long id, LocalDate orderDate, LocalDate requireDate, LocalDate shippedDate, String shipVia, AddressVo shipAddress, CustomerVo customer, EmployeeVo employee) {
        super.setId(id);
        this.orderDate = orderDate;
        this.requireDate = requireDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.shipAddress = shipAddress;
        this.customer = customer;
        this.employee = employee;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getRequireDate() {
        return requireDate;
    }

    public void setRequireDate(LocalDate requireDate) {
        this.requireDate = requireDate;
    }

    public LocalDate getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(LocalDate shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getShipVia() {
        return shipVia;
    }

    public void setShipVia(String shipVia) {
        this.shipVia = shipVia;
    }

    public AddressVo getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(AddressVo shipAddress) {
        this.shipAddress = shipAddress;
    }

    public CustomerVo getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerVo customer) {
        this.customer = customer;
    }

    public EmployeeVo getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeVo employee) {
        this.employee = employee;
    }
}

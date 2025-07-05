package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "order")
public class Order extends AbstractEntity{

    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;
    @Column(name = "require_date")
    private LocalDate requireDate;
    @Column(name = "shipped_date", nullable = false)
    private LocalDate shippedDate;
    @Column(name = "ship_via")
    private String shipVia;
    @OneToOne
    private Address shipAddress;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Order() {
    }

    public Order(LocalDate orderDate, LocalDate requireDate, LocalDate shippedDate, String shipVia, Address shipAddress, Customer customer, Employee employee) {
        this.orderDate = orderDate;
        this.requireDate = requireDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.shipAddress = shipAddress;
        this.customer = customer;
        this.employee = employee;
    }

    public Order(Long id, LocalDate orderDate, LocalDate requireDate, LocalDate shippedDate, String shipVia, Address shipAddress, Customer customer, Employee employee) {
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

    public Address getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(Address shipAddress) {
        this.shipAddress = shipAddress;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderDate, order.orderDate) && Objects.equals(requireDate, order.requireDate) && Objects.equals(shippedDate, order.shippedDate) && Objects.equals(shipVia, order.shipVia) && Objects.equals(shipAddress, order.shipAddress) && Objects.equals(customer, order.customer) && Objects.equals(employee, order.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDate, requireDate, shippedDate, shipVia, shipAddress, customer, employee);
    }

    @Override
    public String toString() {
        return "id: "+ super.getId();
    }
}

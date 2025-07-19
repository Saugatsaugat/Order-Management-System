package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order extends AbstractEntity{

    @NotNull(message = "Order date reason can not be null")
    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @Column(name = "require_date")
    private LocalDate requireDate;

    @Column(name = "shipped_date")
    private LocalDate shippedDate;

    @Column(name = "ship_via")
    private String shipVia;

    @NotNull(message = "Customer can not be null")
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false, referencedColumnName = "id")
    private Customer customer;

    public Order() {
    }

    public Order(LocalDate orderDate, LocalDate requireDate, LocalDate shippedDate, String shipVia, Customer customer) {
        this.orderDate = orderDate;
        this.requireDate = requireDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderDate, order.orderDate) && Objects.equals(requireDate, order.requireDate) && Objects.equals(shippedDate, order.shippedDate) && Objects.equals(shipVia, order.shipVia) && Objects.equals(customer, order.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDate, requireDate, shippedDate, shipVia, customer);
    }

    @Override
    public String toString() {
        return "id: "+ super.getId();
    }
}

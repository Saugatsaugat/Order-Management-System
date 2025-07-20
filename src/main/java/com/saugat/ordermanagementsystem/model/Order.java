package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order extends AbstractEntity{

    @NotNull(message = "Order date reason can not be null")
    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "require_date")
    private LocalDateTime requireDate;

    @Column(name = "shipped_date")
    private LocalDateTime shippedDate;

    @Column(name = "ship_via")
    private String shipVia;

    @NotNull(message = "Customer can not be null")
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false, referencedColumnName = "id")
    private Customer customer;

    public Order() {
    }

    public Order(LocalDateTime orderDate, LocalDateTime requireDate, LocalDateTime shippedDate, String shipVia, Customer customer) {
        this.orderDate = orderDate;
        this.requireDate = requireDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.customer = customer;
    }

    public Order(Long id, LocalDateTime orderDate, LocalDateTime requireDate, LocalDateTime shippedDate, String shipVia, Customer customer) {
        super.setId(id);
        this.orderDate = orderDate;
        this.requireDate = requireDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.customer = customer;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getRequireDate() {
        return requireDate;
    }

    public void setRequireDate(LocalDateTime requireDate) {
        this.requireDate = requireDate;
    }

    public LocalDateTime getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(LocalDateTime shippedDate) {
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

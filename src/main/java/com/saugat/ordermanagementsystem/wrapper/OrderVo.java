package com.saugat.ordermanagementsystem.wrapper;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class OrderVo extends AbstractEntityVo {
    @NotNull(message = "Order date can not be null")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime orderDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime requireDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime shippedDate;

    private String shipVia;

    @NotNull(message = "Customer can not be null")
    private CustomerVo customer;


    public OrderVo() {
    }

    public OrderVo(LocalDateTime orderDate, LocalDateTime requireDate, LocalDateTime shippedDate, String shipVia, CustomerVo customer) {
        this.orderDate = orderDate;
        this.requireDate = requireDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.customer = customer;
    }

    public OrderVo(Long id, LocalDateTime orderDate, LocalDateTime requireDate, LocalDateTime shippedDate, String shipVia, CustomerVo customer) {
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

    public CustomerVo getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerVo customer) {
        this.customer = customer;
    }
}

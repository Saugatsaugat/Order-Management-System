package com.saugat.ordermanagementsystem.wrapper;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OrderDetailVo extends AbstractEntityVo {

    private BigDecimal unitPrice;
    private Long quantity;
    private BigDecimal discount;
    private ProductVo product;
    private OrderVo order;
    private AddressVo address;

    public OrderDetailVo() {
    }

    public OrderDetailVo(BigDecimal unitPrice, Long quantity, BigDecimal discount, ProductVo product, OrderVo order, AddressVo address) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
        this.product = product;
        this.order = order;
        this.address = address;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public ProductVo getProduct() {
        return product;
    }

    public void setProduct(ProductVo product) {
        this.product = product;
    }

    public OrderVo getOrder() {
        return order;
    }

    public void setOrder(OrderVo order) {
        this.order = order;
    }

    public AddressVo getAddress() {
        return address;
    }

    public void setAddress(AddressVo address) {
        this.address = address;
    }
}

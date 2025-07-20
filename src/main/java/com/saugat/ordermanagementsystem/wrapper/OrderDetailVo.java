package com.saugat.ordermanagementsystem.wrapper;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OrderDetailVo extends AbstractEntityVo {

    @NotNull(message = "Unit price can not be null")
    private BigDecimal unitPrice;

    @NotNull(message = "Quantity can not be null")
    private Long quantity;

    private BigDecimal discount;

    @NotNull(message = "Product can not be null")
    private ProductVo product;

    @NotNull(message = "Order can not be null")
    private OrderVo order;

    @NotNull(message = "Address can not be null")
    private AddressVo address;

    private ShipperVo shipper;

    public OrderDetailVo() {
    }

    public OrderDetailVo(BigDecimal unitPrice, Long quantity, BigDecimal discount, ProductVo product, OrderVo order, AddressVo address, ShipperVo shipper) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
        this.product = product;
        this.order = order;
        this.address = address;
        this.shipper = shipper;
    }

    public OrderDetailVo(Long id, BigDecimal unitPrice, Long quantity, BigDecimal discount, ProductVo product, OrderVo order, AddressVo address, ShipperVo shipper) {
        super.setId(id);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
        this.product = product;
        this.order = order;
        this.address = address;
        this.shipper = shipper;
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

    public ShipperVo getShipper() {
        return shipper;
    }

    public void setShipper(ShipperVo shipper) {
        this.shipper = shipper;
    }
}

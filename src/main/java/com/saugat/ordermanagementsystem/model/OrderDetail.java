package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "order_detail")
public class OrderDetail extends AbstractEntity{

    @NotNull(message = "Unit price can not be null")
    @Column(name = "unit_price", nullable = false)
    private BigDecimal unitPrice;

    @NotNull(message = "Quantity can not be null")
    @Column(name = "quantity", nullable = false)
    private Long quantity;

    @Column(name = "discount", nullable = true, columnDefinition = "Decimal(19, 2) default '0.00'")
    private BigDecimal discount = BigDecimal.ZERO;

    @NotNull(message = "Product can not be null")
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    private Product product;

    @NotNull(message = "Address can not be null")
    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id", nullable = false)
    private Address address;

    @ManyToOne
    @JoinColumn(name = "shipper_id", referencedColumnName = "id")
    private Shipper shipper;


    public OrderDetail() {
    }

    public OrderDetail(BigDecimal unitPrice, Long quantity, BigDecimal discount, Product product, Address address, Shipper shipper) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
        this.product = product;
        this.address = address;
        this.shipper = shipper;
    }

    public OrderDetail(Long id, BigDecimal unitPrice, Long quantity, BigDecimal discount, Product product, Address address, Shipper shipper) {
        super.setId(id);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
        this.product = product;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Shipper getShipper() {
        return shipper;
    }

    public void setShipper(Shipper shipper) {
        this.shipper = shipper;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetail that = (OrderDetail) o;
        return Objects.equals(unitPrice, that.unitPrice) && Objects.equals(quantity, that.quantity) && Objects.equals(discount, that.discount) && Objects.equals(product, that.product) && Objects.equals(address, that.address) && Objects.equals(shipper, that.shipper);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitPrice, quantity, discount, product, address, shipper);
    }

    @Override
    public String toString() {
        return "id: "+ super.getId();
    }
}

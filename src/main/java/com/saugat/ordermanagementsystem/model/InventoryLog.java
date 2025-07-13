package com.saugat.ordermanagementsystem.model;

import com.saugat.ordermanagementsystem.enums.ProductRateChangeEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "inventory_log")
public class InventoryLog extends AbstractEntity{

    @Column(name = "product_id")
    private Long productId;
    @Column(name="change_amount")
    private BigDecimal changeAmount;

    @Enumerated(EnumType.STRING)
    @Column(name = "change_reason")
    private ProductRateChangeEnum changeReason;

    public InventoryLog() {
    }

    public InventoryLog(Long productId, BigDecimal changeAmount, ProductRateChangeEnum changeReason) {
        this.productId = productId;
        this.changeAmount = changeAmount;
        this.changeReason = changeReason;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(BigDecimal changeAmount) {
        this.changeAmount = changeAmount;
    }

    public ProductRateChangeEnum getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(ProductRateChangeEnum changeReason) {
        this.changeReason = changeReason;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InventoryLog that = (InventoryLog) o;
        return Objects.equals(productId, that.productId) && Objects.equals(changeAmount, that.changeAmount) && changeReason == that.changeReason;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, changeAmount, changeReason);
    }

    @Override
    public String toString() {
        return "Id: "+super.getId();
    }
}

package com.saugat.ordermanagementsystem.model;

import com.saugat.ordermanagementsystem.enums.ProductRateChangeEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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

    @Column(name = "log_datetime", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime logDateTime;

    public InventoryLog() {
    }

    public InventoryLog(Long productId, BigDecimal changeAmount, ProductRateChangeEnum changeReason, LocalDateTime logDateTime) {
        this.productId = productId;
        this.changeAmount = changeAmount;
        this.changeReason = changeReason;
        this.logDateTime = logDateTime;
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

    public LocalDateTime getLogDateTime() {
        return logDateTime;
    }

    public void setLogDateTime(LocalDateTime logDateTime) {
        this.logDateTime = logDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InventoryLog that = (InventoryLog) o;
        return Objects.equals(productId, that.productId) && Objects.equals(changeAmount, that.changeAmount) && changeReason == that.changeReason && Objects.equals(logDateTime, that.logDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, changeAmount, changeReason, logDateTime);
    }

    @Override
    public String toString() {
        return "Id: "+super.getId();
    }
}

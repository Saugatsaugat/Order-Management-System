package com.saugat.ordermanagementsystem.wrapper;

import com.saugat.ordermanagementsystem.enums.ProductRateChangeEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
public class InventoryLogVo extends AbstractEntityVo{

    @NotNull(message = "Product can not be null")
    private Long productId;

    @NotNull(message = "Change amount can not be null")
    private BigDecimal changeAmount;

    @NotNull(message = "Change reason can not be null")
    @Enumerated(EnumType.STRING)
    private ProductRateChangeEnum changeReason;

    @NotNull(message = "Log date time can not be null")
    private LocalDateTime logDateTime;

    public InventoryLogVo() {
    }

    public InventoryLogVo(Long productId, BigDecimal changeAmount, ProductRateChangeEnum changeReason, LocalDateTime logDateTime) {
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
}

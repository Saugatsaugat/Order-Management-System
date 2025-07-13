package com.saugat.ordermanagementsystem.wrapper;

import com.saugat.ordermanagementsystem.enums.ProductRateChangeEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class InventoryLogVo extends AbstractEntityVo{
    private Long productId;
    private BigDecimal changeAmount;
    @Enumerated(EnumType.STRING)
    private ProductRateChangeEnum changeReason;

    public InventoryLogVo() {
    }

    public InventoryLogVo(Long productId, BigDecimal changeAmount, ProductRateChangeEnum changeReason) {
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
}

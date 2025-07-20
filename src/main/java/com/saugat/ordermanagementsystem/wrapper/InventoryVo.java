package com.saugat.ordermanagementsystem.wrapper;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
public class InventoryVo extends AbstractEntityVo{

    @NotNull(message = "Product can not be null")
    private ProductVo product;

    @NotNull(message = "Quantity per unit can not be null")
    private Long quantityPerUnit;

    @NotNull(message = "Unit price can not be null")
    private BigDecimal unitPrice;

    @NotNull(message = "Unit in stock can not be null")
    private Long unitsInStock;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastUpdated;

    public InventoryVo() {
    }

    public InventoryVo(ProductVo product, Long quantityPerUnit, BigDecimal unitPrice, Long unitsInStock, LocalDateTime lastUpdated) {
        this.product = product;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.lastUpdated = lastUpdated;
    }

    public ProductVo getProduct() {
        return product;
    }

    public void setProduct(ProductVo product) {
        this.product = product;
    }

    public Long getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(Long quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Long unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}

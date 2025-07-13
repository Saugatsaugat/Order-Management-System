package com.saugat.ordermanagementsystem.wrapper;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalTime;

@Component
public class InventoryVo extends AbstractEntityVo{
    private ProductVo product;
    private Long quantityPerUnit;
    private BigDecimal unitPrice;
    private Long unitsInStock;
    private LocalTime lastUpdated;

    public InventoryVo() {
    }

    public InventoryVo(ProductVo product, Long quantityPerUnit, BigDecimal unitPrice, Long unitsInStock, LocalTime lastUpdated) {
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

    public LocalTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}

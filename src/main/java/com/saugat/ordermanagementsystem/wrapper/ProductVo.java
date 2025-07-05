package com.saugat.ordermanagementsystem.wrapper;

import com.saugat.ordermanagementsystem.model.Supplier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductVo extends AbstractEntityVo{
    private String name;
    private Long quantityPerUnit;
    private BigDecimal unitPrice;
    private Long unitsInStock;
    private Supplier supplier;
    private CategoryVo category;

    public ProductVo() {
    }

    public ProductVo(Long id, String name, Long quantityPerUnit, BigDecimal unitPrice, Long unitsInStock, Supplier supplier, CategoryVo category) {
        super.setId(id);
        this.name = name;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.supplier = supplier;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public CategoryVo getCategory() {
        return category;
    }

    public void setCategory(CategoryVo category) {
        this.category = category;
    }
}

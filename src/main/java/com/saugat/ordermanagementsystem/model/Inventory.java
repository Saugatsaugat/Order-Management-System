package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name="inventory")
public class Inventory extends AbstractEntity{

    @NotNull(message = "Product can not be null")
    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", unique = true, nullable = false)
    private Product product;

    @NotNull(message = "Quantity per unit can not be null")
    @Column(name = "quantity_per_unit", nullable = false)
    private Long quantityPerUnit;

    @NotNull(message = "Unit price can not be null")
    @Column(name = "unit_price", nullable = false)
    private BigDecimal unitPrice;

    @NotNull(message = "Units in stock can not be null")
    @Column(name = "units_in_stock", nullable = false)
    private Long unitsInStock;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    public Inventory() {
    }

    public Inventory(Product product, Long quantityPerUnit, BigDecimal unitPrice, Long unitsInStock, LocalDateTime lastUpdated) {
        this.product = product;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.lastUpdated = lastUpdated;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return Objects.equals(product, inventory.product) && Objects.equals(quantityPerUnit, inventory.quantityPerUnit) && Objects.equals(unitPrice, inventory.unitPrice) && Objects.equals(unitsInStock, inventory.unitsInStock) && Objects.equals(lastUpdated, inventory.lastUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, quantityPerUnit, unitPrice, unitsInStock, lastUpdated);
    }

    @Override
    public String toString() {
        return "Id: "+super.getId();
    }
}

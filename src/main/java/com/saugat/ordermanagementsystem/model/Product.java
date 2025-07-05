package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "product")
public class Product extends AbstractEntity{
    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "quantity_per_unit")
    private Long quantityPerUnit;
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    @Column(name = "units_in_stock")
    private Long unitsInStock;
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product() {
    }

    public Product(String name, Long quantityPerUnit, BigDecimal unitPrice, Long unitsInStock, Supplier supplier, Category category) {
        this.name = name;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.supplier = supplier;
        this.category = category;
    }

    public Product(Long id, String name, Long quantityPerUnit, BigDecimal unitPrice, Long unitsInStock, Supplier supplier, Category category) {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(quantityPerUnit, product.quantityPerUnit) && Objects.equals(unitPrice, product.unitPrice) && Objects.equals(unitsInStock, product.unitsInStock) && Objects.equals(supplier, product.supplier) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantityPerUnit, unitPrice, unitsInStock, supplier, category);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantityPerUnit=" + quantityPerUnit +
                ", unitPrice=" + unitPrice +
                ", unitsInStock=" + unitsInStock +
                ", supplier=" + supplier +
                ", category=" + category +
                '}';
    }
}

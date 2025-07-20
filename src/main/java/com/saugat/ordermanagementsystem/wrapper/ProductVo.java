package com.saugat.ordermanagementsystem.wrapper;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
public class ProductVo extends AbstractEntityVo{
    @NotNull(message = "Product name can not be null")
    private String name;

    @NotNull(message = "Supplier can not be null")
    private SupplierVo supplier;

    @NotNull(message = "Caategory can not be null")
    private CategoryVo category;

    public ProductVo() {
    }

    public ProductVo(String name, SupplierVo supplier, CategoryVo category) {
        this.name = name;
        this.supplier = supplier;
        this.category = category;
    }

    public ProductVo(Long id, String name, SupplierVo supplier, CategoryVo category) {
        super.setId(id);
        this.name = name;
        this.supplier = supplier;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SupplierVo getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierVo supplier) {
        this.supplier = supplier;
    }

    public CategoryVo getCategory() {
        return category;
    }

    public void setCategory(CategoryVo category) {
        this.category = category;
    }
}

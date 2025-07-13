package com.saugat.ordermanagementsystem.wrapper;

import com.saugat.ordermanagementsystem.model.Supplier;
import org.springframework.stereotype.Component;

@Component
public class ProductVo extends AbstractEntityVo{
    private String name;
    private Supplier supplier;
    private CategoryVo category;

    public ProductVo() {
    }

    public ProductVo(String name, Supplier supplier, CategoryVo category) {
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

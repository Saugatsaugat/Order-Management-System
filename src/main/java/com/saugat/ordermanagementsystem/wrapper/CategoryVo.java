package com.saugat.ordermanagementsystem.wrapper;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
public class CategoryVo extends AbstractEntityVo{

    @NotNull(message = "Category name can not be null")
    private String name;

    private String description;

    public CategoryVo() {
    }

    public CategoryVo(Long id, String name, String description) {
        super.setId(id);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

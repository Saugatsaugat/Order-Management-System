package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.CategoryService;
import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.wrapper.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("categoryController")
@RequestMapping("/category")
public class CategoryController extends AbstractController<CategoryVo> {

    @Autowired
    private CategoryService service;

    @Override
    protected IService<CategoryVo> getService() {
        return service;
    }

    @GetMapping("/ping")
    public String pingMe(){
        return "Category";
    }
}

package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.wrapper.CategoryVo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController extends AbstractController<CategoryVo> {
    @Override
    protected IService<CategoryVo> getService() {
        return null;
    }
}

package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.service.ProductService;
import com.saugat.ordermanagementsystem.wrapper.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("productController")
@RequestMapping("/product")
public class ProductController extends AbstractController<ProductVo> {

    @Autowired
    private ProductService service;

    @Override
    protected IService<ProductVo> getService() {
        return service;
    }
}

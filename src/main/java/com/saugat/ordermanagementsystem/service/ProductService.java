package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.ProductMapper;
import com.saugat.ordermanagementsystem.model.Product;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.ProductRepo;
import com.saugat.ordermanagementsystem.wrapper.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService extends AbstractService<Product, ProductVo> {

    @Autowired
    private ProductRepo repo;
    @Autowired
    private ProductMapper mapper;

    @Override
    public String getServiceName() {
        return "Product";
    }

    @Override
    public AbstractRepo<Product> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<Product, ProductVo> getMapper() {
        return mapper;
    }
}

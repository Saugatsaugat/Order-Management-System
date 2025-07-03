package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.CategoryMapper;
import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.model.Category;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.CategoryRepo;
import com.saugat.ordermanagementsystem.wrapper.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends AbstractService<Category, CategoryVo> {

    @Autowired
    private CategoryMapper mapper;

    @Autowired
    private CategoryRepo repo;

    @Override
    public String getServiceName() {
        return "Category";
    }

    @Override
    public AbstractRepo<Category> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<Category, CategoryVo> getMapper() {
        return mapper;
    }
}

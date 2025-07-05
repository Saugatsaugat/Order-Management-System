package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.SupplierMapper;
import com.saugat.ordermanagementsystem.model.Supplier;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.SupplierRepo;
import com.saugat.ordermanagementsystem.wrapper.SupplierVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService extends AbstractService<Supplier, SupplierVo> {

    @Autowired
    private SupplierRepo repo;
    @Autowired
    private SupplierMapper mapper;

    @Override
    public String getServiceName() {
        return "Supplier";
    }

    @Override
    public AbstractRepo<Supplier> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<Supplier, SupplierVo> getMapper() {
        return mapper;
    }
}

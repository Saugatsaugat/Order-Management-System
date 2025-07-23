package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.SupplierAddressMapper;
import com.saugat.ordermanagementsystem.model.SupplierAddress;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.SupplierAddressRepo;
import com.saugat.ordermanagementsystem.wrapper.SupplierAddressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SupplierAddressService extends AbstractService<SupplierAddress, SupplierAddressVo> {

    @Autowired
    private SupplierAddressRepo repo;
    @Autowired
    private SupplierAddressMapper mapper;

    @Override
    public String getServiceName() {
        return "SupplierAddress";
    }

    @Override
    public AbstractRepo<SupplierAddress> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<SupplierAddress, SupplierAddressVo> getMapper() {
        return mapper;
    }
}

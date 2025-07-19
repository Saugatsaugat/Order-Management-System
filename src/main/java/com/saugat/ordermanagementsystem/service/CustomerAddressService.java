package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.CustomerAddressMapper;
import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.model.CustomerAddress;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.CustomerAddressRepo;
import com.saugat.ordermanagementsystem.wrapper.CustomerAddressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerAddressService extends AbstractService<CustomerAddress, CustomerAddressVo> {

    @Autowired
    private CustomerAddressRepo repo;
    @Autowired
    private CustomerAddressMapper mapper;

    @Override
    public String getServiceName() {
        return "CustomerAddress";
    }

    @Override
    public AbstractRepo<CustomerAddress> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<CustomerAddress, CustomerAddressVo> getMapper() {
        return mapper;
    }
}

package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.CustomerMapper;
import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.model.Customer;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.CustomerRepo;
import com.saugat.ordermanagementsystem.wrapper.CustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends AbstractService<Customer, CustomerVo> {

    @Autowired
    private CustomerRepo repo;
    @Autowired
    private CustomerMapper mapper;

    @Override
    public String getServiceName() {
        return "Customer";
    }

    @Override
    public AbstractRepo<Customer> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<Customer, CustomerVo> getMapper() {
        return mapper;
    }
}

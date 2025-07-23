package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.AddressMapper;
import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.model.Address;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.AddressRepo;
import com.saugat.ordermanagementsystem.wrapper.AddressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AddressService extends AbstractService<Address, AddressVo> {

    @Autowired
    private AddressRepo repo;

    @Autowired
    private AddressMapper mapper;

    @Override
    public String getServiceName() {
        return "Address";
    }

    @Override
    public AbstractRepo<Address> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<Address, AddressVo> getMapper() {
        return mapper;
    }
}

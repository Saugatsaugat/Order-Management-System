package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.EmployeeAddressMapper;
import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.model.EmployeeAddress;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.EmployeeAddressRepo;
import com.saugat.ordermanagementsystem.wrapper.EmployeeAddressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeAddressService extends AbstractService<EmployeeAddress, EmployeeAddressVo>{

    @Autowired
    private EmployeeAddressRepo repo;
    @Autowired
    private EmployeeAddressMapper mapper;

    @Override
    public String getServiceName() {
        return "EmployeeAddress";
    }

    @Override
    public AbstractRepo<EmployeeAddress> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<EmployeeAddress, EmployeeAddressVo> getMapper() {
        return mapper;
    }
}

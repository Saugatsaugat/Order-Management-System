package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.AddressMapper;
import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.model.Address;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.AddressRepo;
import com.saugat.ordermanagementsystem.wrapper.AddressVo;
import com.saugat.ordermanagementsystem.wrapper.api.ApiResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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

    public static final Logger logger = LogManager.getLogger(AddressService.class);

    @Override
    public ResponseEntity<ApiResponse<AddressVo>> create(AddressVo vo){
        Address address = repo.save(mapper.fromDto(vo));
        logger.info("Address created | ID={} | timestamp={}", address.getId(), new Date());
        return responseBuilder(true, "Address created successfully", mapper.toDto(address) );
    }
}

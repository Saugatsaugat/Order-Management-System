package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.ShipperMapper;
import com.saugat.ordermanagementsystem.model.Shipper;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.ShipperRepo;
import com.saugat.ordermanagementsystem.wrapper.ShipperVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipperService extends AbstractService<Shipper, ShipperVo> {

    @Autowired
    private ShipperRepo repo;
    @Autowired
    private ShipperMapper mapper;

    @Override
    public String getServiceName() {
        return "Shipper";
    }

    @Override
    public AbstractRepo<Shipper> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<Shipper, ShipperVo> getMapper() {
        return mapper;
    }
}

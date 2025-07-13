package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.InventoryMapper;
import com.saugat.ordermanagementsystem.model.Inventory;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.InventoryRepo;
import com.saugat.ordermanagementsystem.wrapper.InventoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService extends AbstractService<Inventory, InventoryVo> {

    @Autowired
    private InventoryRepo repo;

    @Autowired
    private InventoryMapper mapper;

    @Override
    public String getServiceName() {
        return "Inventory";
    }

    @Override
    public AbstractRepo<Inventory> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<Inventory, InventoryVo> getMapper() {
        return mapper;
    }
}

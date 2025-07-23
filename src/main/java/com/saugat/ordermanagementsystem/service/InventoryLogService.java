package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.InventoryLogMapper;
import com.saugat.ordermanagementsystem.model.InventoryLog;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.InventoryLogRepo;
import com.saugat.ordermanagementsystem.wrapper.InventoryLogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InventoryLogService extends AbstractService<InventoryLog, InventoryLogVo> {

    @Autowired
    private InventoryLogRepo repo;
    @Autowired
    private InventoryLogMapper mapper;

    @Override
    public String getServiceName() {
        return "Inventory Log";
    }

    @Override
    public AbstractRepo<InventoryLog> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<InventoryLog, InventoryLogVo> getMapper() {
        return mapper;
    }
}

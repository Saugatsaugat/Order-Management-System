package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.OrderDetailMapper;
import com.saugat.ordermanagementsystem.model.OrderDetail;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.OrderDetailRepo;
import com.saugat.ordermanagementsystem.wrapper.OrderDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderDetailService extends AbstractService<OrderDetail, OrderDetailVo> {

    @Autowired
    private OrderDetailRepo repo;
    @Autowired
    private OrderDetailMapper mapper;

    @Override
    public String getServiceName() {
        return "Order Detail";
    }

    @Override
    public AbstractRepo<OrderDetail> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<OrderDetail, OrderDetailVo> getMapper() {
        return mapper;
    }
}

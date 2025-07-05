package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.Order;
import com.saugat.ordermanagementsystem.wrapper.OrderVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {CustomerMapper.class, EmployeeMapper.class, AddressMapper.class, ShipperMapper.class})
public abstract class OrderMapper implements IBaseMapper<Order, OrderVo> {
}

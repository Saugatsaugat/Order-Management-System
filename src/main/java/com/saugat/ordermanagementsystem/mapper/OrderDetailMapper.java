package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.OrderDetail;
import com.saugat.ordermanagementsystem.wrapper.OrderDetailVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {OrderMapper.class, ProductMapper.class, AddressMapper.class, ShipperMapper.class})
public abstract class OrderDetailMapper implements IBaseMapper<OrderDetail, OrderDetailVo> {
}

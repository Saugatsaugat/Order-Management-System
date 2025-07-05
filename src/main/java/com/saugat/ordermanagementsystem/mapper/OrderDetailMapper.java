package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.OrderDetail;
import com.saugat.ordermanagementsystem.wrapper.OrderDetailVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(config = IMapperConfig.class, uses = {OrderMapper.class, ProductMapper.class})
public abstract class OrderDetailMapper implements IBaseMapper<OrderDetail, OrderDetailVo> {
}

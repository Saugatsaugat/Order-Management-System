package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.Shipper;
import com.saugat.ordermanagementsystem.wrapper.ShipperVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {})
public abstract class ShipperMapper implements IBaseMapper<Shipper, ShipperVo> {
}

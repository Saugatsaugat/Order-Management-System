package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.Supplier;
import com.saugat.ordermanagementsystem.wrapper.SupplierVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {AddressMapper.class})
public abstract class SupplierMapper implements IBaseMapper<Supplier, SupplierVo> {
}

package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.SupplierAddress;
import com.saugat.ordermanagementsystem.wrapper.SupplierAddressVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {SupplierMapper.class, AddressMapper.class})
public abstract class SupplierAddressMapper implements IBaseMapper<SupplierAddress, SupplierAddressVo>  {
}

package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.CustomerAddress;
import com.saugat.ordermanagementsystem.wrapper.CustomerAddressVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {CustomerMapper.class, AddressMapper.class})
public abstract class CustomerAddressMapper implements IBaseMapper<CustomerAddress, CustomerAddressVo> {

}

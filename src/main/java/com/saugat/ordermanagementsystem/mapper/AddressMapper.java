package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.Address;
import com.saugat.ordermanagementsystem.wrapper.AddressVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(config = IMapperConfig.class, uses = {})
public abstract class AddressMapper implements IBaseMapper<Address, AddressVo> {
}

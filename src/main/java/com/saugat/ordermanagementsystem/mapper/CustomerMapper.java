package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.Customer;
import com.saugat.ordermanagementsystem.wrapper.CustomerVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(config = IMapperConfig.class, uses = {AddressMapper.class})
public abstract class CustomerMapper implements IBaseMapper<Customer, CustomerVo> {
}

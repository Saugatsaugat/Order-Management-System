package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.EmployeeAddress;
import com.saugat.ordermanagementsystem.wrapper.EmployeeAddressVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {EmployeeMapper.class, AddressMapper.class})
public abstract class EmployeeAddressMapper implements IBaseMapper<EmployeeAddress, EmployeeAddressVo>{
}

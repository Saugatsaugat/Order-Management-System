package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.Employee;
import com.saugat.ordermanagementsystem.wrapper.EmployeeVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {AddressMapper.class})
public abstract class EmployeeMapper implements IBaseMapper<Employee, EmployeeVo> {
}

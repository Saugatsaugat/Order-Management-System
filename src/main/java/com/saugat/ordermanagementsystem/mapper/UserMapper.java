package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.User;
import com.saugat.ordermanagementsystem.wrapper.UserVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {CustomerMapper.class, EmployeeMapper.class})
public abstract class UserMapper implements IBaseMapper<User, UserVo> {

}

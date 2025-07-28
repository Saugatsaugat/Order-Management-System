package com.saugat.ordermanagementsystem.mapper;

import com.saugat.ordermanagementsystem.model.UserRole;
import com.saugat.ordermanagementsystem.wrapper.UserRoleVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {UserMapper.class})
public abstract class UserRoleMapper implements IBaseMapper<UserRole, UserRoleVo> {
}

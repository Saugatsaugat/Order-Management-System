package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.UserRoleMapper;
import com.saugat.ordermanagementsystem.model.UserRole;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.UserRoleRepo;
import com.saugat.ordermanagementsystem.wrapper.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserRoleService extends AbstractService<UserRole, UserRoleVo> {

    @Autowired
    private UserRoleRepo repo;

    @Autowired
    private UserRoleMapper mapper;

    @Override
    public String getServiceName() {
        return "User Repo";
    }

    @Override
    public AbstractRepo<UserRole> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<UserRole, UserRoleVo> getMapper() {
        return mapper;
    }
}

package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.mapper.UserMapper;
import com.saugat.ordermanagementsystem.model.User;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.UserRepo;
import com.saugat.ordermanagementsystem.wrapper.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, UserVo> {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserMapper userMapper;

    @Override
    public String getServiceName() {
        return "User";
    }

    @Override
    public AbstractRepo<User> getRepository() {
        return userRepo;
    }

    @Override
    public IBaseMapper<User, UserVo> getMapper() {
        return userMapper;
    }
}

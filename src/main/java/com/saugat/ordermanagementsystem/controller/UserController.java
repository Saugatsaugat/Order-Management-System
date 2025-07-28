package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.service.UserService;
import com.saugat.ordermanagementsystem.wrapper.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("userController")
@RequestMapping("/user")
public class UserController extends AbstractController<UserVo> {

    @Autowired
    private UserService service;

    @Override
    protected IService getService() {
        return service;
    }
}

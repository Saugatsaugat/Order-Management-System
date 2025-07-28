package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.service.UserRoleService;
import com.saugat.ordermanagementsystem.wrapper.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("userRoleController")
@RequestMapping("/userRole")
public class UserRoleController extends AbstractController<UserRoleVo> {

    @Autowired
    private UserRoleService service;

    @Override
    protected IService getService() {
        return null;
    }
}

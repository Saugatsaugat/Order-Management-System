package com.saugat.ordermanagementsystem.service;

import com.saugat.ordermanagementsystem.mapper.EmployeeMapper;
import com.saugat.ordermanagementsystem.mapper.IBaseMapper;
import com.saugat.ordermanagementsystem.model.Employee;
import com.saugat.ordermanagementsystem.repo.AbstractRepo;
import com.saugat.ordermanagementsystem.repo.EmployeeRepo;
import com.saugat.ordermanagementsystem.wrapper.EmployeeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService extends AbstractService<Employee, EmployeeVo> {

    @Autowired
    private EmployeeRepo repo;
    @Autowired
    private EmployeeMapper mapper;

    @Override
    public String getServiceName() {
        return "Employee";
    }

    @Override
    public AbstractRepo<Employee> getRepository() {
        return repo;
    }

    @Override
    public IBaseMapper<Employee, EmployeeVo> getMapper() {
        return mapper;
    }
}

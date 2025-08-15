package com.saugat.ordermanagementsystem.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
public class UserVo extends AbstractEntityVo{
    @NotNull(message = "First name can not be null")
    private String firstName;

    @NotNull(message = "Last name can not be null")
    private String lastName;

    @NotNull(message = "Email can not be null")
    private String email;

    @NotNull(message = "Password can not be null")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private EmployeeVo employee;

    private CustomerVo customer;

    public UserVo() {
    }

    public UserVo(String firstName, String lastName, String email, String password, EmployeeVo employee, CustomerVo customer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.employee = employee;
        this.customer = customer;
    }

    public UserVo(Long id, String firstName, String lastName, String email, String password, EmployeeVo employee, CustomerVo customer) {
        super.setId(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.employee = employee;
        this.customer = customer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EmployeeVo getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeVo employee) {
        this.employee = employee;
    }

    public CustomerVo getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerVo customer) {
        this.customer = customer;
    }
}

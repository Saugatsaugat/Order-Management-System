package com.saugat.ordermanagementsystem.wrapper;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class EmployeeVo extends AbstractEntityVo {

    @NotNull(message = "Employee firstname can not be null")
    private String firstName;

    private String lastName;

    private String title;

    private LocalDate birthDate;

    @NotNull(message = "Employee hired date can not be null")
    private LocalDate hireDate;

    @NotNull(message = "Employee phone number can not be null")
    private String phone;

    public EmployeeVo() {
    }

    public EmployeeVo(String firstName, String lastName, String title, LocalDate birthDate, LocalDate hireDate, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.phone = phone;
    }

    public EmployeeVo(Long id, String firstName, String lastName, String title, LocalDate birthDate, LocalDate hireDate, String phone) {
        super.setId(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.phone = phone;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

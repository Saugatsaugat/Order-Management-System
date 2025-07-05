package com.saugat.ordermanagementsystem.wrapper;

import com.saugat.ordermanagementsystem.model.Address;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class EmployeeVo extends AbstractEntityVo {
    private String firstName;
    private String lastName;
    private String title;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private AddressVo address;
    private String phone;

    public EmployeeVo() {
    }

    public EmployeeVo(Long id, String firstName, String lastName, String title, LocalDate birthDate, LocalDate hireDate, AddressVo address, String phone) {
        super.setId(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
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

    public AddressVo getAddress() {
        return address;
    }

    public void setAddress(AddressVo address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

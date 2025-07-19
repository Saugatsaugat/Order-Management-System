package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "employee")
public class Employee extends AbstractEntity {

    @NotNull(message = "Employee firstname can not be null")
    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "title")
    private String title;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @NotNull(message = "Employee hired date can not be null")
    @Column(name = "hire_date", nullable = false)
    private LocalDate hireDate;

    @NotNull(message = "Employee phone number can not be null")
    @Column(name = "phone", length = 15, unique = true, nullable = false)
    private String phone;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String title, LocalDate birthDate, LocalDate hireDate, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.phone = phone;
    }

    public Employee(Long id, String firstName, String lastName, String title, LocalDate birthDate, LocalDate hireDate, String phone) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(title, employee.title) && Objects.equals(birthDate, employee.birthDate) && Objects.equals(hireDate, employee.hireDate) && Objects.equals(phone, employee.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, title, birthDate, hireDate, phone);
    }

    @Override
    public String toString() {
        return "id: " + super.getId();
    }
}

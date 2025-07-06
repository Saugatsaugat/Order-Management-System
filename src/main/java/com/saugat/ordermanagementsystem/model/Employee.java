package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "employee")
public class Employee extends AbstractEntity {

    @Column(name = "first_name", length = 50)
    private String firstName;
    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column(name = "title")
    private String title;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "hire_date")
    private LocalDate hireDate;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @Column(name = "phone", length = 15, unique = true)
    private String phone;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String title, LocalDate birthDate, LocalDate hireDate, Address address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
        this.phone = phone;
    }

    public Employee(Long id, String firstName, String lastName, String title, LocalDate birthDate, LocalDate hireDate, Address address, String phone) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(title, employee.title) && Objects.equals(birthDate, employee.birthDate) && Objects.equals(hireDate, employee.hireDate) && Objects.equals(address, employee.address) && Objects.equals(phone, employee.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, title, birthDate, hireDate, address, phone);
    }

    @Override
    public String toString() {
        return "id: " + super.getId();
    }
}

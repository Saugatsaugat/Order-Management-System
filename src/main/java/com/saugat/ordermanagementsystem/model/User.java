package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table(name = "user")
public class User extends AbstractEntity{
    @NotNull(message = "Employee firstname can not be null")
    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @NotNull(message = "Email is required")
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NotNull(message = "Password is required")
    @Column(name = "password", nullable = false, unique = true)
    private String password;

    @OneToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id", nullable = true)
    private Employee employee;

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = true)
    private Customer customer;

    public User() {
    }

    public User(String firstName, String lastName, String email, String password, Employee employee, Customer customer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.employee = employee;
        this.customer = customer;
    }

    public User(Long id, String firstName, String lastName, String email, String password, Employee employee, Customer customer) {
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(employee, user.employee) && Objects.equals(customer, user.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, password, employee, customer);
    }

    @Override
    public String toString() {
        return "Id: "+super.getId();
    }
}

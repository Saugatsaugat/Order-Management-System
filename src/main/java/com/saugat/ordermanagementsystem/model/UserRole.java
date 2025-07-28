package com.saugat.ordermanagementsystem.model;

import com.saugat.ordermanagementsystem.enums.UserRoleEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table(name = "user_role")
public class UserRole extends AbstractEntity{

    @NotNull(message = "User role enum can not be null")
    @Enumerated(EnumType.STRING)
    @Column(name = "user_role", nullable = false, unique = false)
    private UserRoleEnum userRole;

    @OneToOne
    @NotNull(message = "User can not be null")
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public UserRole() {
    }

    public UserRole(UserRoleEnum userRole, User user) {
        this.userRole = userRole;
        this.user = user;
    }

    public UserRole(Long id, UserRoleEnum userRole, User user) {
        super.setId(id);
        this.userRole = userRole;
        this.user = user;
    }

    public UserRoleEnum getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRoleEnum userRole) {
        this.userRole = userRole;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserRole userRole1 = (UserRole) o;
        return userRole == userRole1.userRole && Objects.equals(user, userRole1.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userRole, user);
    }

    @Override
    public String toString() {
        return "Id: "+super.getId();
    }
}

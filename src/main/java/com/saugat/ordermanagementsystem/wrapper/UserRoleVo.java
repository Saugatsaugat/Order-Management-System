package com.saugat.ordermanagementsystem.wrapper;

import com.saugat.ordermanagementsystem.enums.UserRoleEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class UserRoleVo extends AbstractEntityVo{

    @NotNull(message = "User role can not be null")
    @Enumerated(EnumType.STRING)
    private UserRoleEnum userRole;

    @NotNull(message = "User can not be null")
    private UserVo user;

    public UserRoleVo() {
    }

    public UserRoleVo(UserRoleEnum userRole, UserVo user) {
        this.userRole = userRole;
        this.user = user;
    }

    public UserRoleVo(Long id, UserRoleEnum userRole, UserVo user) {
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

    public UserVo getUser() {
        return user;
    }

    public void setUser(UserVo user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserRoleVo that = (UserRoleVo) o;
        return userRole == that.userRole && Objects.equals(user, that.user);
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

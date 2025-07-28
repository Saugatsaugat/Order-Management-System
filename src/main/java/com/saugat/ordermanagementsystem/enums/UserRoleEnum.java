package com.saugat.ordermanagementsystem.enums;

public enum UserRoleEnum implements IAbstractEnum{
    ROLE_CUSTOMER("Role Customer"),
    ROLE_EMPLOYEE("Role Employee"),
    ROLE_ADMIN("Role Admin");

    private final String val;
    private String getVal(){return val;}

    private UserRoleEnum(String val){this.val = val;}
    @Override
    public String getValue() {
        return val;
    }
}

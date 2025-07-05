package com.saugat.ordermanagementsystem.wrapper;

import org.springframework.stereotype.Component;

@Component
public class ShipperVo extends AbstractEntityVo {

    private String companyName;
    private String phone;

    public ShipperVo() {
    }

    public ShipperVo(Long id, String companyName, String phone) {
        super.setId(id);
        this.companyName = companyName;
        this.phone = phone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

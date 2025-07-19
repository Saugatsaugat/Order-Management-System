package com.saugat.ordermanagementsystem.wrapper;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
public class ShipperVo extends AbstractEntityVo {

    @NotNull(message = "Company name can not be null")
    private String companyName;
    @NotNull(message = "Shipper phone number can not be null")
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

package com.saugat.ordermanagementsystem.wrapper;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
public class SupplierAddressVo extends AbstractEntityVo{

    @NotNull(message = "Supplier can not be null")
    private SupplierVo supplier;

    @NotNull(message = "Address can not be null")
    private AddressVo address;

    public SupplierAddressVo() {
    }

    public SupplierAddressVo(SupplierVo supplier, AddressVo address) {
        this.supplier = supplier;
        this.address = address;
    }

    public SupplierVo getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierVo supplier) {
        this.supplier = supplier;
    }

    public AddressVo getAddress() {
        return address;
    }

    public void setAddress(AddressVo address) {
        this.address = address;
    }
}

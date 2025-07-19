package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "supplier_address")
public class SupplierAddress  extends AbstractEntity{

    @NotNull(message = "Supplier can not be null")
    @ManyToOne
    @JoinColumn(name = "supplier_id", referencedColumnName = "id")
    private Supplier supplier;

    @NotNull(message = "Address can not be null")
    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    public SupplierAddress() {
    }

    public SupplierAddress(Supplier supplier, Address address) {
        this.supplier = supplier;
        this.address = address;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Id: "+ super.getId();
    }
}

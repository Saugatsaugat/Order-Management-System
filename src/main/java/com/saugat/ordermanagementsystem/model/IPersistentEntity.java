package com.saugat.ordermanagementsystem.model;

public interface IPersistentEntity<PK> {
    public PK getId();
    public void setId(PK id);
}

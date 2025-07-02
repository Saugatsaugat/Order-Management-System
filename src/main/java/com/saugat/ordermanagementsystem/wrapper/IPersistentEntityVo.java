package com.saugat.ordermanagementsystem.wrapper;

public interface IPersistentEntityVo<PK> {
    public PK getId();
    public void setId(PK id);
}

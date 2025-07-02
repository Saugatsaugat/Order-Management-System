package com.saugat.ordermanagementsystem.wrapper;

import java.time.LocalTime;

public abstract class AbstractEntityVo extends AbstractPKEntityVo {

    private LocalTime createdAt;
    private LocalTime modifiedAt;

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}

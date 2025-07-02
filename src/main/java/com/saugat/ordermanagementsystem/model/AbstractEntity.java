package com.saugat.ordermanagementsystem.model;

import java.time.LocalTime;

public abstract class AbstractEntity extends AbstractPKEntity{
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

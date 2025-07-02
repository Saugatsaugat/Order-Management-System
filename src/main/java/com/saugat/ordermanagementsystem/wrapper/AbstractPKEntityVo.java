package com.saugat.ordermanagementsystem.wrapper;

public abstract class AbstractPKEntityVo implements IPersistentEntityVo<Long>{

    private Long id;

    @Override
    public Long getId(){return id;}

    @Override
    public void setId(Long id){this.id = id;}
}

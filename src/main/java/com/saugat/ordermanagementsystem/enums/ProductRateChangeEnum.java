package com.saugat.ordermanagementsystem.enums;

public enum ProductRateChangeEnum implements IAbstractEnum{
    ORDER_PLACED("OrderPlaced"),
    RESTOCK("Restock"),
    ADJUSTMENT("Adjustment");

    private final String val;
    private String getVal(){return val;}

    private ProductRateChangeEnum(String val){this.val = val;}
    @Override
    public String getValue() {
        return val;
    }
}

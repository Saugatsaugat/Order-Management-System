package com.saugat.ordermanagementsystem.exceptions;

public class CustomException extends RuntimeException{
    public CustomException(){super();}
    public CustomException(String msg){super(msg);}
    public CustomException(String msg, Exception e){super(msg, e);}
}

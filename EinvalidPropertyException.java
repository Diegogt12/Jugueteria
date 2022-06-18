package com.company;

public class EinvalidPropertyException extends Exception{
    private String ex;

    public EinvalidPropertyException(String ex) {
        super(ex);
    }
}

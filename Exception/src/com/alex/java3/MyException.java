package com.alex.java3;

public class MyException extends RuntimeException {
    
    static final long serialVersionUID = 1L;

    public MyException(){

    }

    public MyException(String message){
        super(message);
    }
}

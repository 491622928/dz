package com.example.demo.util;

public class ExceptionUtil extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ExceptionUtil(Integer code,String message) {
        super(message);
        this.code = code;
    }
}

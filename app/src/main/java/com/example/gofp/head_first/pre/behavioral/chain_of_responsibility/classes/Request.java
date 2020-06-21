package com.example.gofp.head_first.pre.behavioral.chain_of_responsibility.classes;

public class Request {
    private String message;
    private int code;


    public Request(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}

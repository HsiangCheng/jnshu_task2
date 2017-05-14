package com.semonx.jnshu.web;

/**
 * Created by Semon on 2017/5/13.
 */
public class Error {
    private int code;
    private String message;

    public Error(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

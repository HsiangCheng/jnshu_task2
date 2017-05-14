package com.semonx.jnshu.web.exception;

/**
 * Created by Semon on 2017/5/13.
 */
public class StudentNotFoundException extends RuntimeException {
    private long id;

    public StudentNotFoundException(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}

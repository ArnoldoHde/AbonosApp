package com.example.arnoldo.myapplication;

/**
 * Created by arnoldo on 10/04/18.
 */

class ErrorEvent {
    public String message = "";
    public int code = 0;
    public ErrorEvent(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
    }


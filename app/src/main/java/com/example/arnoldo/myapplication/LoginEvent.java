package com.example.arnoldo.myapplication;

/**
 * Created by arnoldo on 10/04/18.
 */

public class LoginEvent {
    private String token;

    public LoginEvent(String message) {
        this.token = message;
    }
    public String getMessage() {
        return token;
    }
}

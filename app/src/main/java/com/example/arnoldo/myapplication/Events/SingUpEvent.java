package com.example.arnoldo.myapplication.Events;

/**
 * Created by alan on 11/04/18.
 */

public class SingUpEvent {
    private String token;

    public SingUpEvent(String message) {
        this.token = message;
    }

    public String getMessage() {
        return token;
    }
}

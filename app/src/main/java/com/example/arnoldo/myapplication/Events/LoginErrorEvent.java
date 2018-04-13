package com.example.arnoldo.myapplication.Events;

/**
 * Created by arnoldo on 10/04/18.
 */
//Este eveno en caso de que alla un error como 404 not found y esos tipos de errores
public class LoginErrorEvent {
    public String message = "";
    public int code = 0;

    public LoginErrorEvent(String message, int code) {
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

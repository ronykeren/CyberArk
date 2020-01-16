package com.example.exceptions;

public class WrongAgeException extends Exception {

    private int wrongAge;

    public WrongAgeException(String message, int wrongAge) {
        super(message);
        this.wrongAge = wrongAge;
    }

    public int getWrongAge() {
        return wrongAge;
    }
}

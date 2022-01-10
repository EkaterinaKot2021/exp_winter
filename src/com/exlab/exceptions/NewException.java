package com.exlab.exceptions;

public class NewException extends Exception {
    private final static String MESSAGE = "My new exception!!!!";

    public NewException() {
        super(MESSAGE);
    }

}

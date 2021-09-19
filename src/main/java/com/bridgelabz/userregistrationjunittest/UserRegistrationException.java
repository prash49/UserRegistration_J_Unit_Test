package com.bridgelabz.userregistrationjunittest;

public class UserRegistrationException extends Exception {
    String message;

    enum ExceptionType {
        NULL, EMPTY;
    }

    ExceptionType type;

    public UserRegistrationException(ExceptionType type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

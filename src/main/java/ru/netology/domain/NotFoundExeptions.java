package ru.netology.domain;

public class NotFoundExeptions extends RuntimeException {
    public NotFoundExeptions() {

    }

    public NotFoundExeptions(String message) {
        super(message);
    }

    public NotFoundExeptions(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundExeptions(Throwable cause) {
        super(cause);
    }

    public NotFoundExeptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
package com.company.bws.objects;

public class SweetLogicException extends Exception {

    public SweetLogicException() {
    }

    public SweetLogicException(String message, Throwable exception) {
        super(message, exception);
    }

    public SweetLogicException(String message) {
        super(message);
    }

    public SweetLogicException(Throwable exception) {
        super(exception);
    }
}

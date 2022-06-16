package edu.iims.mcs.oops.week8.daopatternwithoutgenerics.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }

}

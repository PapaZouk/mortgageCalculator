package model.exception;

public class MortgageException extends RuntimeException{
    public MortgageException() {
        super("Case not handled");
    }
}

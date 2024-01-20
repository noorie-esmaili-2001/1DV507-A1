package se.lnu.Exercise3.Exceptions;

public class NotEnoughSpaceException extends RuntimeException {
    public NotEnoughSpaceException(String s) {
        super(s);
    }
}

package de.neuefische.exceptions;

public class OrderNotFoundException extends Throwable{
    public OrderNotFoundException(String message) {
        super(message);
    }
}

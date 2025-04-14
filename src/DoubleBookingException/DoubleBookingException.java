package DoubleBookingException;

public class DoubleBookingException extends Exception {

    public DoubleBookingException(){
        super("Double Booking Detected");
    }

    public DoubleBookingException(String message){
        super(message);
    }
}

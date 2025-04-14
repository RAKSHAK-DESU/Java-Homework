package DoubleBookingException;

public class BookingService {
    boolean doubleBooked;
    public void bookSlot() throws DoubleBookingException {
        if(doubleBooked){
            throw new DoubleBookingException("Slot is Already Booked");
        }
    }

    public void reserveSlot() throws DoubleBookingException{
        if(doubleBooked){
            throw new DoubleBookingException("Slot is Already Reserved");
        }
    }


}

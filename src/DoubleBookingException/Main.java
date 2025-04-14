package DoubleBookingException;

public class Main {
    public static void main(String[] args){
        BookingService bookingService= new BookingService();

        bookingService.doubleBooked=true;

        try{
            bookingService.bookSlot();
        }catch (DoubleBookingException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}

package Hotel;

import java.util.Scanner;

public class Hotel {
    String hotelName;
    int noOfRooms;
    int roomTaken;
    int roomPrice;

    boolean isHotelFull;
    int roomsAvailable= noOfRooms-roomTaken;

    public Hotel(String hotelName,int noOfRooms,int roomTaken, int roomPrice, boolean isHotelFull, int roomsAvailable){
        this.hotelName=hotelName;
        this.noOfRooms=noOfRooms;
        this.roomTaken=roomTaken;
        this.roomPrice=roomPrice;
        this.isHotelFull=isHotelFull;
        this.roomsAvailable=roomsAvailable;
    }

    void getDetails(){
        System.out.println("Hotel Name is "+hotelName+" There are total "+noOfRooms+" of Rooms "+
                " Room Price Starts from "+roomPrice+" and the hotel is full? "+isHotelFull);
    }

    void isRoomAvailable(){
        if(isHotelFull!=true){
            System.out.println(roomsAvailable+" Rooms are available");

        }else {
            System.out.println("Rooms are not available");
        };
    }

    void bookRoom(int wantedRooms) {
        if (!isHotelFull) {
            if (wantedRooms <= (noOfRooms - roomTaken)) {
                roomTaken += wantedRooms;
                System.out.println("Rooms booked successfully!");
            } else {
                System.out.println("but Not enough rooms available.");
            }
        } else {
            System.out.println("Hotel is full. No rooms available.");
        }


        if (roomTaken >= noOfRooms) {
            isHotelFull = true;
        }

    }
    public static void main(String[] args){
        Hotel Hilton= new Hotel("Hilton",50,45,10000,false,5);
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many Rooms you wanna book?");
        int wantedRooms= scanner.nextInt();

        Hilton.getDetails();
        Hilton.isRoomAvailable();
        Hilton.bookRoom(wantedRooms);

        Customer cus1= new Customer("Andrew",38);


    }
}










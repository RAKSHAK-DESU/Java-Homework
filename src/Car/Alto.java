package Car;

public class Alto extends Car {
        int noOfSeats;

        public Alto(String brand, int speed , int noOfSeats){
            super(brand,speed);
            this.noOfSeats=noOfSeats;
        }

        public void showDetails(){
            displayInfo();
            System.out.println("Number of seats are:"+noOfSeats);
        }


}

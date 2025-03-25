package Car;

import java.sql.SQLOutput;

public class Car {
    String brand;
    int speed;

    Car(String brand, int speed){
        this.brand= brand;
        this.speed=speed;
    }

    void displayInfo(){
        System.out.println("Brand :"+ brand);
        System.out.println("Speed :"+ speed+"km/hr");
    }
}

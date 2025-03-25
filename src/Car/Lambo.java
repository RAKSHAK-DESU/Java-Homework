package Car;

public class Lambo extends Car{
    String model;

    public Lambo(String brand, int speed , String model){
        super(brand,speed);
        this.model=model;
    }

    public void showDetails(){
        displayInfo();
        System.out.println("Model:"+model);
    }
}

public class City {
    String name;
    long population;
    int GDP;

    public City(String name, int population,int GDP){
        this.name=name;
        this.population=population;
        this.GDP=GDP;
    }

    public void displayInfo(){
        System.out.println("City name is "+name);
        System.out.println("City population is "+population);
    }

    void PrintGdp(){
        System.out.println("GDP of "+name+" is "+GDP);
    }

    public static void main(String[] args){
        City Nyc= new City("Nyc",2000000,300000);
        Nyc.displayInfo();
        Nyc.PrintGdp();
        City Bucharest = new City("Bucharest",100000,300000);
        Bucharest.PrintGdp();
        Bucharest.displayInfo();
    }
}

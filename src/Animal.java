public class Animal {
    String Name;
    int Age;
    boolean Wild;
    boolean Pet;

    public Animal(String Name, int Age,boolean Wild, Boolean Pet ){
        this.Age=Age;
        this.Name=Name;
        this.Wild=Wild;
        this.Pet=Pet;
    }

    void DisplayInfo(){
        System.out.println(Name);
        System.out.println("Age of "+Name +" is "+Age);
        System.out.println(Name+" is an wild animal? "+Wild);
        System.out.println(Name+" is an Pet animal? "+Pet);
    }

    void WildAnimal(){
        System.out.println("Is "+Name+" Wild Animal? "+ Wild);
    }

    void PetAnimal(){
        System.out.println("Is "+Name+" Pet Animal? "+ Pet);
    }

    public static void main(String[] args){
        Animal Panther= new Animal("Panther",30,true,false);
        Panther.DisplayInfo();

        Animal Cat = new Animal("Cat",20,true,true);
        Cat.PetAnimal();
        Cat.DisplayInfo();
    }

}

public class Pokemon {
    String Name;
    String Type;
    int Hp;
    int Defence;
    float Weight;
    String SpecialMove;
    Boolean Friendly;
    void DisplayInfo(){
        System.out.println("Name of the pokemon is"+Name);
        System.out.println("Type of "+Name+" is "+Type);
        System.out.println("HP of "+Name+" is "+Hp);
        System.out.println("Defence of "+Name+" is "+Defence);
        System.out.println("Weight of "+Name+" is "+Weight);
        System.out.println("Special Move of "+Name+" is "+SpecialMove);
    }
    void Friendliness(){
        System.out.println("Is "+Name+" Friendly ?"+Friendly);
    }
    void Possession(){
        System.out.println("Do you Possess "+Name+" ? "+"Yes");
    }
    void Walk(){
        System.out.println("Can "+Name+" Walk?"+ "Yes");
    }
    void Fly(){
        System.out.println("Can "+Name+" Fly?"+ "Yes");
    }
    void Swim(){
        System.out.println("Can "+Name+" Swim?"+ "Yes");
    }

    public static void main(String args[]){
        Pokemon Pikachu = new Pokemon();
        Pikachu.Name= "Pikachu";
        Pikachu.Friendly=true;
        Pikachu.SpecialMove="Thunderbolt";
        Pikachu.Hp= 33;
        Pikachu.Defence= 44;
        Pikachu.Type="Electric";
        Pikachu.DisplayInfo();
        Pikachu.Fly();
        Pikachu.Possession();
    }
}

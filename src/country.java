public class country {
        String Name;
        long Population;
        float GDP;
        float IQ_level;
        Boolean Wealthy;

        void DisplayInfo(){
            System.out.println("Name of the Country is "+Name);
            System.out.println("Population of the "+Name+"is "+Population);
            System.out.println("GDP of the "+Name+" is "+GDP);
            System.out.println("Average IQ level of  "+Name+" is "+IQ_level);
            System.out.println("Is it rich "+Wealthy);
        }
        void AverageSalary(){
            System.out.println("Average salary is : 10k usd");
        }
        void PopularFestival(){
            System.out.println("Popular festival is : halloween");
        }
        void CapitalCity(){
            System.out.println("Capital city is Kuala lumpur");
        }
        void MainIndustry(){
            System.out.println("Main industry is Casino");
        }

    public static void main(String args[]){
            country Singapore = new country();
            Singapore.Name= "Singapore";
            Singapore.Population=20000000;
            Singapore.GDP=100000000;
            Singapore.IQ_level=166;
            Singapore.Wealthy= true;
            Singapore.AverageSalary();
            Singapore.CapitalCity();
            Singapore.DisplayInfo();
            Singapore.PopularFestival();

            country Syria = new country();
            Syria.Name="Syria";
            Syria.Population=100000000;
            Syria.GDP=100000;
            Syria.IQ_level= 60;
            Syria.Wealthy= false;
            Syria.CapitalCity();
            Syria.DisplayInfo();
            Syria.MainIndustry();

    }

}

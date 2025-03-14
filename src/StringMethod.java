import java.util.ArrayList;

public class StringMethod {
    //Creating the arraylist
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> str1= new ArrayList<>();

        num.add(1);
        str1.add("Rakshak");
        str1.add("Cobra");
        str1.add("Eagle");

        System.out.println(num);
        System.out.println(str1);

        str1.remove(0);
        System.out.println(str1);

        //Playing with strings
        String s="BANK";

        // string using new keyword
        String s1="BANK";
        System.out.println(s1);
        //String keywords

        System.out.println(s.compareTo(s1));





    }


}

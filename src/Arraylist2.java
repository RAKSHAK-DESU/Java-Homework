import java.util.ArrayList;
import java.util.Collections;

public class Arraylist2 {
    public static void main(String[] args){
        ArrayList<Integer> list1= new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3= new ArrayList<Boolean>();

        list1.add(100);
        list1.add(0,2);
        list1.add(30);
        list1.add(90);

        list1.set(0,10000); // changed the 1st element to 10000
       // System.out.println(list1);


        Collections.sort(list1);
       // System.out.println(list1.get(1));
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1.size());

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }

}

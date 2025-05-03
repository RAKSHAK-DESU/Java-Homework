import java.util.ArrayList;
import java.util.Collections;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add /get /modify /delete/remove /iterate

        //add
        list.add(10);
        list.add(0, 100);

        //get
        int r = list.get(1);


        //modify
        list.set(1, 200);

        list.add(2);
        list.add(20000);
        Collections.sort(list);


        //remove
        list.remove(2);
        System.out.println(list);

        int t = list.size();
        System.out.println(t);
        for (int i = 0; i < t; i++) {
            System.out.println(i);
        }
    }
    }



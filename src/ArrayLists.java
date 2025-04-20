import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //add
        list.add(0);
        list.add(100);
        list.add(20);

        //get
        int r = list.get(2);
        System.out.println(list);
        //add element in between
        // list.add(INDEX_NO, ELEMENT);
        list.add(0,200);
        System.out.println(list);
        //200,0,100,20
        //set element , modify the element
        list.set(0,2);
        //[2, 0, 100, 20]
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        //delete element
        list.remove(2);
        System.out.println(list);

        //System.out.println(list.size());

        //loop
        for (int i = 0; i < list.size(); i++) {
            //int n= list.get(i);
            System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }

}

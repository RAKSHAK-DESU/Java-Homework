import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.add(1, "X");

        list.remove("B");
        System.out.println("Element at index 1: " + list.get(1));

        System.out.println("Size: " + list.size());

        for (String item : list) {
            System.out.println(item);
        }
    }
}

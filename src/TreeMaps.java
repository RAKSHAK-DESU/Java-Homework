import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {

        Map<Integer,String> studentGrades= new TreeMap<>();

        studentGrades.put(101,"Ali - A");
        studentGrades.put(102,"Chad - b");
        studentGrades.put(103,"Fahid - c");

        System.out.println("ThreeMap Series");

        for (Map.Entry<Integer,String> entry : studentGrades.entrySet()){
            System.out.println("Student ID:"+entry.getKey()+",Grade info:"+entry.getValue());
        }

        System.out.println(studentGrades.get(103));
    }
}

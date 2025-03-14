import java.util.HashMap;
import java.util.*;
public class FrequencyOfWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String with random words");
        String str= scanner.nextLine().toLowerCase(); // to avoid case sensitivity

        String[] words=str.split(" "); // Splitting by space

        //Hashmap stores word freq
        HashMap<String, Integer> wordCount= new HashMap<>();

        //count the words
        for (String word:words){
            wordCount.put(word,wordCount.getOrDefault(word,0)+1); // If the word in HashMap it adds 1.
        }

        //print word freq
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

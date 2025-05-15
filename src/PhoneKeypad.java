import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneKeypad {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number between 2 - 9");
        char num= sc.next().charAt(0);
        Map<Character,String> KeyPad= new TreeMap<Character,String>();

        KeyPad.put('2',"ABC");
        KeyPad.put('3',"DEF");
        KeyPad.put('4',"GHI");
        KeyPad.put('5',"JKL");
        KeyPad.put('6',"MNO");
        KeyPad.put('7',"PQRS");
        KeyPad.put('8',"TUV");
        KeyPad.put('9',"WXYZ");

        System.out.println("Looking up Digit '"+num+"'....");
        if (KeyPad.containsKey(num)){
            System.out.println("Digit '"+ num+"' Maps to "+KeyPad.get(num));
        }else {
            System.out.println("Digit '"+ num+"' has no letter Mapping");
        }
    }
}

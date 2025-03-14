import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter 8 random integers");

        int sum=0;
        int [] arr= new int[8];

        for(int i=0;i<8;i++){
            arr[i]=scanner.nextInt();
        }

       //  System.out.println("The array is"+arr); // Mistake made:- Java wont print the element , the output was [I@2dda6444
       // arr is an object so the actual elements wont be printed instead memory address would be printed
        System.out.println("The array is "+ Arrays.toString(arr));

        //Sort fxn
        Arrays.sort(arr);
        for (int i=0;i<8;i++){
            System.out.println(arr[i]);
        }


        //sum of all elements
        for(int i=0;i<8;i++){
            sum+=arr[i];
        }

        System.out.println("Sum of array is  :"+sum);

    }
}

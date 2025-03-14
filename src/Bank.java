import java.util.Scanner;
public class Bank {
    static double balance= 999999;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name= "Rakshak";
        String address= "Tokyo";
        String contact= "8788141773";

        userName(name);
        userAddress(address);
        userContact(contact);
        userBankBalance(balance);

        System.out.println("Enter Amount to Withdraw : ");
        double amount = scanner.nextDouble();
        withDrawMoney(amount);

        System.out.println("How much you wanna deposite");
        double depositeAmount= scanner.nextDouble();
        depositeMoney(depositeAmount);

    }
    public static void userName(String name){
        System.out.println(name);
    }
    public static void userAddress(String address){
        System.out.println(address);
    }
    public static void userContact(String number){
        System.out.println(number);
    }
    public static void userBankBalance(double balance){
        System.out.println("$"+balance);
    }
    public static void withDrawMoney(double amount){
        if(amount> balance){
            System.out.println("ERROR: bank Balance not Sufficient ! try again");
        }
        else{
            balance= balance-amount;
            System.out.println("Withdraw Sucessfull !Sucessfully Withdrew $"+amount+" Remaining Balance $ "+balance);
        }
    }
    public static void depositeMoney(double depositeAmount){
            balance= balance+depositeAmount;
            System.out.println("Deposited $" +depositeAmount+" Sucessfully ! Total Balance is $"+balance);
    }
}

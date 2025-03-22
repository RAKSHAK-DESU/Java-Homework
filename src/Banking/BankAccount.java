package Banking;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int accountHolderAge;
    private double accountBalance;

    private BankAccount(int accountNumber, String accountHolderName,int accountHolderAge, double accountBalance){
        this.accountNumber= accountNumber;
        this.accountHolderName= accountHolderName;
        this.accountHolderAge= accountHolderAge;
        this.accountBalance= accountBalance;
    }

    public void deposit(double amount){
        if(amount>0){
            accountBalance+=amount;
            System.out.println("Deposited : "+amount);
        }else{
            System.out.println("Invalid Deposit amount");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=accountBalance){
            accountBalance=-amount;
            System.out.println("Withdraw of "+amount+" Successful!");
        }else{
            System.out.println("Insufficient Bank Balance");
        }
    }

    public void checkBalance(){
        System.out.println("Account number: "+accountNumber);
        System.out.println("Account Holder name: "+accountHolderName);
        System.out.println("Account Holder age: "+accountHolderAge);
        System.out.println("Account Balance :"+accountBalance);
    }

    public static void main(String[] args){
        BankAccount acc1= new BankAccount(101,"Justin",20,2000000);
        BankAccount acc2= new BankAccount(102,"Tristan",30,20000000);
        BankAccount acc3= new BankAccount(103,"Andrew",38,1000000000);
        BankAccount acc4= new BankAccount(104,"Chad",54,189084349);
        BankAccount acc5= new BankAccount(105,"Cobra",38,2000000000);
        acc1.deposit(2000);
        acc1.checkBalance();
        acc1.withdraw(200066668);

        acc4.withdraw(1000);
        acc2.checkBalance();
        acc3.deposit(200000);
        acc5.deposit(1000000000);
    }
}

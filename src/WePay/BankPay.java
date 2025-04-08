package WePay;

public class BankPay extends WePay{
    public BankPay(int amount, String payername, int payerBalance) {
        super(amount, payername,payerBalance);
    }

    @Override
    void processPayment() {
        System.out.println("Processing Payment");
        totalTransaction++;
    }
}

package WePay;

public class BankPay extends WePay{
    public BankPay(int amount, String payername) {
        super(amount, payername);
    }

    @Override
    void processPayment() {
        System.out.println("Processing Payment");
        totalTransaction++;
    }
}

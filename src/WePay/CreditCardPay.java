package WePay;

public class CreditCardPay extends WePay implements Refundable {

    public CreditCardPay(int amount, String payername) {
        super(amount, payername);
    }

    @Override
    void processPayment() {
        System.out.println("Processing Payment");
        totalTransaction++;
    }

    @Override
    public void processRefund() {
        System.out.println("Processing Refund");
    }


}

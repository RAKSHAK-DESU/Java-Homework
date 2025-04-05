package WePay;

public class UpiPay extends WePay  implements Refundable {

    public UpiPay(int amount,String payerName) {
        super(amount,payerName);
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

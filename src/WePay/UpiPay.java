package WePay;

public class UpiPay extends WePay  implements Refundable {

    public UpiPay(int amount,String payerName, int payerBalance) {
        super(amount,payerName,payerBalance);
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

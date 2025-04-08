package WePay;

abstract public class WePay {
    int amount;
    String payername;
    int payerBalance;
    protected static int totalTransaction=0;

    public WePay() {

    }

    abstract void processPayment();
    final static int MAX_TRANSACTION_LIMIT=10000000;

    public WePay(int amount,String payername, int payerBalance){
        this.amount=amount;
        this.payername=payername;
        this.payerBalance=payerBalance;
    }



}

package WePay;

public class WePaySystem {
    public static void main(String[] args){
        CreditCardPay CreditPay= new CreditCardPay(50000,"Nene Hingawe",200000000);
        UpiPay UpiPay=new UpiPay(500000,"Remi Hingawe",20000000);
        BankPay BankPay= new BankPay(5000000,"Kanna Hingawe",200000000);
        BankPay BannkPay2= new BankPay(5000000,"Suzuka Hingawe",200000000);

        CreditPay.processPayment();
        UpiPay.processPayment();
        BankPay.processPayment();
        BannkPay2.processPayment();

        UpiPay.processRefund();
    }
}

package WePay;

public class WePaySystem {
    public static void main(String[] args){
        CreditCardPay CreditPay= new CreditCardPay(50000,"Alice Hingawe");
        UpiPay UpiPay=new UpiPay(500000,"Remi Hinagwe");
        BankPay BankPay= new BankPay(5000000,"Kanna Hingawe");

        CreditPay.processPayment();
        UpiPay.processPayment();
        BankPay.processPayment();

        UpiPay.processRefund();
    }
}

interface PaymentGateway{
    abstract void makePayment();
}
class GooglePay implements PaymentGateway{
    @Override
    public void makePayment() {
        System.out.println("Payment completed using Googlepay");
    }
}
class Phonepe implements PaymentGateway{
    @Override
    public void makePayment() {
        System.out.println("Payment completed using Phonepe");
    }
}
public class Main4 {
    public static void main(String[] args) {
        PaymentGateway p1=new GooglePay();
        PaymentGateway p2=new Phonepe();
        p1.makePayment();
        p2.makePayment();
    }
}

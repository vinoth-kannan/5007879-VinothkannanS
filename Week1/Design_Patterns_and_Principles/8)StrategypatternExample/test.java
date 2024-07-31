public class test {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "vinoth", "123");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(1000.00);
        PaymentStrategy paytmPayment = new PaytmPayment("vinothkannansaravanan@gmail.com", "vinoth123");
        paymentContext.setPaymentStrategy(paytmPayment);
        paymentContext.executePayment(94.00);
    }
}
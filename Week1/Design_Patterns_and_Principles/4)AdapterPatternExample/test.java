public class test {
    public static void main(String[] args) {
        PaytmGateway paytmGateway = new PaytmGateway();
        PaymentProcessor paytmProcessor = new PaytmAdapter(paytmGateway);
        paytmProcessor.processPayment(10000.00);
    }
}

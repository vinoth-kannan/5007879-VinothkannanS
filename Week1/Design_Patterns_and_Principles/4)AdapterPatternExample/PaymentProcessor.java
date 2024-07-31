public interface PaymentProcessor {
    void processPayment(double amount);
}
class PaytmGateway {
    public void payWithPaytm(double amount) {
        System.out.println("Processing payment of Rs " + amount + " through Paytm.");
    }
}

class PaytmAdapter implements PaymentProcessor {
    private PaytmGateway paytmGateway;
    public PaytmAdapter(PaytmGateway paytmGateway) {
        this.paytmGateway = paytmGateway;
    }
    @Override
    public void processPayment(double amount) {
        paytmGateway.payWithPaytm(amount);
    }
}

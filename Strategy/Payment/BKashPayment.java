package Strategy.Payment;
public class BKashPayment implements PaymentStrategy {
    private String phoneNumber;

    public BKashPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " BDT using BKash");
        System.out.println("Phone: " + phoneNumber);
    }
}

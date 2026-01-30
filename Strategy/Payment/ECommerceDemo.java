package Strategy.Payment;
public class ECommerceDemo {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        System.out.println("=== Checkout: Item Total $150 ===\n");

        System.out.println("Customer selects Credit Card:");
        paymentService.setPaymentStrategy(new CreditCardPayment("1234567812345678", "John Doe"));
        paymentService.checkout(150);

        System.out.println("\n---\n");

        System.out.println("Customer switches to BKash:");
        paymentService.setPaymentStrategy(new BKashPayment("01712345678"));
        paymentService.checkout(150);

        System.out.println("\n---\n");

        System.out.println("Customer switches to Bitcoin:");
        paymentService.setPaymentStrategy(new CryptoPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        paymentService.checkout(150);
    }
}

package State.ATM;

public class ATMDemo {
    public static void main(String[] args) {
        System.out.println("=== ATM Machine Simulation ===\n");
        
        ATM atm = new ATM(1234, 1000.0);
        
        System.out.println("--- Scenario 1: Successful Withdrawal ---");
        atm.insertCard();
        atm.enterPin(1234);
        atm.selectTransaction();
        atm.withdrawCash(200);
        atm.ejectCard();
        
        System.out.println("\n--- Scenario 2: Invalid PIN ---");
        atm.insertCard();
        atm.enterPin(9999);
        
        System.out.println("\n--- Scenario 3: Insufficient Balance ---");
        atm.insertCard();
        atm.enterPin(1234);
        atm.selectTransaction();
        atm.withdrawCash(2000);
        atm.ejectCard();
        
        System.out.println("\n--- Scenario 4: Cancel Transaction ---");
        atm.insertCard();
        atm.enterPin(1234);
        atm.ejectCard();
        
        System.out.println("\n--- Scenario 5: Invalid Operations ---");
        atm.withdrawCash(100);
        atm.selectTransaction();
        atm.enterPin(1234);
    }
}

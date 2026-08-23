import java.util.Scanner;

interface PaymentMethod {
    void makePayment(double amount);
}

class UPI implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing payment of " + amount + " via UPI.");
    }
}

class CreditCard implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing payment of " + amount + " via Credit Card.");
    }
}

class NetBanking implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing payment of " + amount + " via Net Banking.");
    }
}

public class TUT5Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select payment method: 1-UPI, 2-Credit Card, 3-Net Banking");
        int choice = sc.nextInt();

        System.out.println("Enter amount:");
        double amount = sc.nextDouble();

        PaymentMethod payment;

        switch (choice) {
            case 1:
                payment = new UPI();
                break;
            case 2:
                payment = new CreditCard();
                break;
            case 3:
                payment = new NetBanking();
                break;
            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        payment.makePayment(amount);
        sc.close();
    }
}

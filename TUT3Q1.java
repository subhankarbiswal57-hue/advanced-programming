import java.util.Scanner;

public class TUT3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] prices = new double[5];
        double totalBill = 0;

        System.out.println("Enter prices of 5 products:");
        for (int i = 0; i < 5; i++) {
            prices[i] = sc.nextDouble();
            totalBill += prices[i];
        }

        System.out.println("Total Bill : " + totalBill);

        if (totalBill > 5000) {
            System.out.println("Discount Applicable");
        } else {
            System.out.println("No Discount");
        }

        sc.close();
    }
}

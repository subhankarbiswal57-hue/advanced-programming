import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of product 1:");
        double p1 = sc.nextDouble();
        System.out.println("Enter price of product 2:");
        double p2 = sc.nextDouble();

        double total = p1 + p2;
        double diff = p1 - p2;
        double product = p1 * p2;
        double quotient = p1 / p2;
        double remainder = p1 % p2;

        System.out.println("Total = " + total);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
    


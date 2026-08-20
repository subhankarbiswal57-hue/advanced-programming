import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary:");
        double basic = sc.nextDouble();
        System.out.println("Enter allowance:");
        double allowance = sc.nextDouble();

        double total = basic + allowance;
        System.out.println("Total salary = " + total);
    }
}

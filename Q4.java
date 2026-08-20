import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number 1:");
        int r1 = sc.nextInt();
        System.out.println("Enter roll number 2:");
        int r2 = sc.nextInt();

        // using temporary variable
        int temp;
        temp = r1;
        r1 = r2;
        r2 = temp;
        System.out.println("After swapping using temp variable:");
        System.out.println("Roll1 = " + r1 + " Roll2 = " + r2);

        // without using temporary variable
        r1 = r1 + r2;
        r2 = r1 - r2;
        r1 = r1 - r2;
        System.out.println("After swapping without temp variable:");
        System.out.println("Roll1 = " + r1 + " Roll2 = " + r2);
    }
}

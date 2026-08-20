import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score of student 1:");
        int s1 = sc.nextInt();
        System.out.println("Enter score of student 2:");
        int s2 = sc.nextInt();
        System.out.println("Enter score of student 3:");
        int s3 = sc.nextInt();

        int highest;
        if (s1 >= s2 && s1 >= s3) {
            highest = s1;
        } else if (s2 >= s1 && s2 >= s3) {
            highest = s2;
        } else {
            highest = s3;
        }

        System.out.println("Highest score is: " + highest);
    }
}

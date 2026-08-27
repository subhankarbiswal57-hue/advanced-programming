import java.util.Scanner;

public class TUT3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] attendance = new int[7];
        int presentCount = 0;

        System.out.println("Enter attendance for 7 days (1 = Present, 0 = Absent):");
        for (int i = 0; i < 7; i++) {
            attendance[i] = sc.nextInt();
            if (attendance[i] == 1) {
                presentCount++;
            }
        }

        double percentage = (presentCount / 7.0) * 100;
        System.out.println("Total Present Days : " + presentCount);
        System.out.println("Attendance Percentage : " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Eligible for Exam");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}

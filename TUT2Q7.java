class Marks {
    double subject1;
    double subject2;
    double subject3;

    void calculate() {
        double total = subject1 + subject2 + subject3;
        double average = total / 3;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class TUT2Q7 {
    public static void main(String[] args) {
        Marks m1 = new Marks();
        m1.subject1 = 78;
        m1.subject2 = 85;
        m1.subject3 = 91;
        m1.calculate();
    }
}

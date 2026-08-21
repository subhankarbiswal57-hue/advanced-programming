class MarksRecord {
    double sub1, sub2, sub3;

    MarksRecord(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    void calculate() {
        double total = sub1 + sub2 + sub3;
        double average = total / 3;
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class Record {
    public static void main(String[] args) {
        MarksRecord m1 = new MarksRecord(78, 85, 92);
        m1.calculate();
    }
}
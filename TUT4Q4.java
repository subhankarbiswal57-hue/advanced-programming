import java.util.Scanner;

class Patient {
    String name;
    double consultationFee;

    Patient(String name, double consultationFee) {
        this.name = name;
        this.consultationFee = consultationFee;
    }

    double calculateFinalAmount() {
        double discount;
        if (consultationFee >= 2000) {
            discount = consultationFee * 0.10;
        } else {
            discount = consultationFee * 0.05;
        }
        return consultationFee - discount;
    }

    double calculateDiscount() {
        return (consultationFee >= 2000) ? consultationFee * 0.10 : consultationFee * 0.05;
    }

    void displayDetails() {
        System.out.println("\nPatient Name : " + name);
        System.out.println("Original Consultation Fee : " + consultationFee);
        System.out.println("Discount : " + calculateDiscount());
        System.out.println("Final Amount : " + calculateFinalAmount());
    }
}

public class TUT4Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient[] patients = new Patient[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details of Patient " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Consultation Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();

            patients[i] = new Patient(name, fee);
        }

        for (int i = 0; i < 5; i++) {
            patients[i].displayDetails();
        }

        sc.close();
    }
}

import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double monthlySalary;

    Employee(int empId, String empName, double monthlySalary) {
        this.empId = empId;
        this.empName = empName;
        this.monthlySalary = monthlySalary;
    }

    void displayDetails() {
        System.out.println("\nEmployee ID : " + empId);
        System.out.println("Name : " + empName);
        System.out.println("Monthly Salary : " + monthlySalary);
    }

    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    double calculateBonus() {
        if (isEligibleForBonus()) {
            return calculateAnnualSalary() * 0.10;
        } else {
            return 0;
        }
    }

    boolean isEligibleForBonus() {
        return monthlySalary >= 30000;
    }
}

public class TUT4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details of Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Monthly Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        for (int i = 0; i < 5; i++) {
            Employee emp = employees[i];
            emp.displayDetails();

            double annualSalary = emp.calculateAnnualSalary();
            double bonus = emp.calculateBonus();
            String eligibility = emp.isEligibleForBonus() ? "Eligible" : "Not Eligible";

            System.out.println("Annual Salary : " + annualSalary);
            System.out.println("Bonus : " + bonus);
            System.out.println("Bonus Eligibility : " + eligibility);
        }

        sc.close();
    }
}

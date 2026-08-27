import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }
}

public class TUT3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Name : ");
        String name = sc.nextLine();
        System.out.print("Salary : ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        emp.display();

        sc.close();
    }
}

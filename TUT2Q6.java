class Employee {
    String name;
    int empId;
    double salary;

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class TUT2Q6 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empId = 101;
        e1.name = "Priya";
        e1.salary = 45000;

        Employee e2 = new Employee();
        e2.empId = 102;
        e2.name = "Rahul";
        e2.salary = 52000;

        e1.display();
        e2.display();
    }
}

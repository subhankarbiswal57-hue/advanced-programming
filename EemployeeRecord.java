class EmployeeRecord {
    String name;
    int empId;
    String designation;
    double salary;

    EmployeeRecord(String name, int empId, String designation, double salary) {
        this.name = name;
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: Rs. " + salary);
        System.out.println();
    }
}

public class EemployeeRecord{
    public static void main(String[] args) {
        EmployeeRecord e1 = new EmployeeRecord("Suresh Kumar", 1001, "Software Engineer", 55000.0);
        EmployeeRecord e2 = new EmployeeRecord("Anita Rao", 1002, "Project Manager", 78000.0);

        e1.display();
        e2.display();
    }
}
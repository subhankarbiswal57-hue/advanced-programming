class Employee {
    String name;
    int employeeId;
    double basicSalary;

    Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println();
    }
}

class Professor extends Employee {
    double researchAllowance;

    Professor(String name, int employeeId, double basicSalary, double researchAllowance) {
        super(name, employeeId, basicSalary);
        this.researchAllowance = researchAllowance;
    }

    @Override
    double calculateSalary() {
        return basicSalary + researchAllowance;
    }
}

class LabAssistant extends Employee {
    double labAllowance;

    LabAssistant(String name, int employeeId, double basicSalary, double labAllowance) {
        super(name, employeeId, basicSalary);
        this.labAllowance = labAllowance;
    }

    @Override
    double calculateSalary() {
        return basicSalary + labAllowance;
    }
}

class AdministrativeStaff extends Employee {
    double overtimePay;

    AdministrativeStaff(String name, int employeeId, double basicSalary, double overtimePay) {
        super(name, employeeId, basicSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    double calculateSalary() {
        return basicSalary + overtimePay;
    }
}

public class TUT5Q2 {
    public static void main(String[] args) {
        Employee e1 = new Professor("Dr. Iyer", 501, 60000, 15000);
        Employee e2 = new LabAssistant("Suresh Kumar", 502, 25000, 5000);
        Employee e3 = new AdministrativeStaff("Neha Verma", 503, 30000, 4000);

        e1.display();
        e2.display();
        e3.display();
    }
}

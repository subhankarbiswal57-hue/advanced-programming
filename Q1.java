class Student {
    String name;
    int rollNumber;
    String department;

    Student(String name, int rollNumber, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student("Arun Kumar", 101, "Computer Science");
        s1.display();
    }
}
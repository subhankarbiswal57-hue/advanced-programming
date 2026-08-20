class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Student s1 = new Student("Priya Sharma", 205);
        s1.display();
    }
}
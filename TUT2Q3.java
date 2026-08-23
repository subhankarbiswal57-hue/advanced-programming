class Student {
    String name;
    int rollNumber;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class TUT2Q3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Arjun";
        s1.rollNumber = 21;
        s1.display();
    }
}

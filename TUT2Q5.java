class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class TUT2Q5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Meera";
        s1.age = 19;

        Student s2 = new Student();
        s2.name = "Karthik";
        s2.age = 20;

        s1.display();
        s2.display();
    }
}

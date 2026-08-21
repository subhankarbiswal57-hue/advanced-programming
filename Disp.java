class StudentInfo {
    String name;
    int age;

    StudentInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Disp {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo("Ravi", 15);
        StudentInfo s2 = new StudentInfo("Meena", 16);

        s1.display();
        s2.display();
    }
}
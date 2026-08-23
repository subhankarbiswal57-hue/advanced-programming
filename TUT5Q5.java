import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class TUT5Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle:");
        double radius = sc.nextDouble();

        System.out.println("Enter length and breadth of rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        System.out.println("Enter base and height of triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        Shape[] shapes = {
            new Circle(radius),
            new Rectangle(length, breadth),
            new Triangle(base, height)
        };

        for (Shape s : shapes) {
            System.out.println("Area: " + s.calculateArea());
        }

        sc.close();
    }
}

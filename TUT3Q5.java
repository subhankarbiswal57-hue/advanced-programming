public class TUT3Q5 {

    // Area of square
    static double area(double side) {
        return side * side;
    }

    // Area of rectangle
    static double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of circle
    static double area(double radius, String shape) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double squareArea = area(5);
        double rectangleArea = area(4, 6);
        double circleArea = area(3, "circle");

        System.out.println("Area of Square : " + squareArea);
        System.out.println("Area of Rectangle : " + rectangleArea);
        System.out.println("Area of Circle : " + circleArea);
    }
}

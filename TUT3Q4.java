class Car {
    String model;
    double price;

    // No details
    Car() {
        this.model = "Not Specified";
        this.price = 0;
    }

    // Only model name
    Car(String model) {
        this.model = model;
        this.price = 0;
    }

    // Model name and price
    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("-------------------");
    }
}

public class TUT3Q4 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Swift");
        Car car3 = new Car("Creta", 1500000);

        car1.display();
        car2.display();
        car3.display();
    }
}

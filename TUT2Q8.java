class Temperature {
    double celsius;

    void convertAndDisplay() {
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}

public class TUT2Q8 {
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        t1.celsius = 37.0;
        t1.convertAndDisplay();
    }
}

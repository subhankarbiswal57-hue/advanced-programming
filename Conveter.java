class TemperatureConverter {
    double celsius;

    TemperatureConverter(double celsius) {
        this.celsius = celsius;
    }

    void convertAndDisplay() {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}

public class Conveter {
    public static void main(String[] args) {
        TemperatureConverter t1 = new TemperatureConverter(37.0);
        t1.convertAndDisplay();
    }
}
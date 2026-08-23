abstract class Product {
    int productId;
    String name;
    double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    double finalPrice() {
        return price - calculateDiscount();
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Price: " + finalPrice());
        System.out.println();
    }
}

class Electronics extends Product {
    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.20;
    }
}

class Books extends Product {
    Books(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.05;
    }
}

public class TUT5Q4 {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(1, "Laptop", 55000),
            new Clothing(2, "Jacket", 2500),
            new Books(3, "Java Programming", 800)
        };

        for (Product p : products) {
            p.display();
        }
    }
}

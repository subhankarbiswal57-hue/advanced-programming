import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
}

public class TUT4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details of Product " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            products[i] = new Product(id, name, price, qty);
        }

        System.out.println("\n--- Billing Details ---");
        for (int i = 0; i < 5; i++) {
            double totalPrice = products[i].price * products[i].quantity;
            double discount;

            if (totalPrice >= 5000) {
                discount = totalPrice * 0.10;
            } else {
                discount = totalPrice * 0.05;
            }

            double finalPrice = totalPrice - discount;

            System.out.println("\nProduct ID: " + products[i].productId);
            System.out.println("Name: " + products[i].productName);
            System.out.println("Total Price: \u20B9" + totalPrice);
            System.out.println("Discount: \u20B9" + discount);
            System.out.println("Final Price: \u20B9" + finalPrice);
        }

        sc.close();
    }
}

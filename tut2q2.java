class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Book b1 = new Book("Let Us Java", "Yashwant Kanetkar", 350.0);
        b1.display();
    }
}

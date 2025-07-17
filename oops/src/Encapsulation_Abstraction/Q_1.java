package Encapsulation_Abstraction;

import java.util.Scanner;

public class Q_1 {
    public static class Author {
        private String name;
        private String email;
        private char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public char getGender() {
            return gender;
        }
    }

    public static class Book {
        private String name;
        private Author author;
        private double price;
        private int qtyInStock;

        public Book(String name, Author author, double price, int qtyInStock) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.qtyInStock = qtyInStock;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQtyInStock() {
            return qtyInStock;
        }

        public void setQtyInStock(int qtyInStock) {
            this.qtyInStock = qtyInStock;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get author details from user
        System.out.println("Enter Author Details:");
        System.out.print("Name: ");
        String authorName = scanner.nextLine();
        
        System.out.print("Email: ");
        String authorEmail = scanner.nextLine();
        
        System.out.print("Gender (M/F/O): ");
        char authorGender = scanner.nextLine().charAt(0);

        // Create author object
        Author author = new Author(authorName, authorEmail, authorGender);

        // Get book details from user
        System.out.println("\nEnter Book Details:");
        System.out.print("Book Name: ");
        String bookName = scanner.nextLine();
        
        System.out.print("Price: ");
        double bookPrice = scanner.nextDouble();
        
        System.out.print("Quantity in Stock: ");
        int bookQty = scanner.nextInt();

        // Create book object
        Book book = new Book(bookName, author, bookPrice, bookQty);

        // Print all details
        System.out.println("\nBook Information:");
        System.out.println("-----------------");
        System.out.println("Book Name: " + book.getName());
        System.out.println("Author Name: " + book.getAuthor().getName());
        System.out.println("Author Email: " + book.getAuthor().getEmail());
        System.out.println("Author Gender: " + book.getAuthor().getGender());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());

        scanner.close();
    }
}

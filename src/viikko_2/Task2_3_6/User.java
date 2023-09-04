package viikko_2.Task2_3_6;

// Create a User class with attributes like name, age, and a list of borrowed books.
import viikko_2.Task2_3_6.BookLibraryUsers;

import java.util.ArrayList;

public class User {
    // Private instance variables.
    private final String name;
    private final int age;
    private final ArrayList<BookLibraryUsers> borrowedBooks;

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>(); // Initialize the borrowedBooks list
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to add a book
    public void addBorrowBook(BookLibraryUsers book) {
        borrowedBooks.add(book);
    }

    // Method to remove a book
    public void removeBorrowBook(BookLibraryUsers book) {
        borrowedBooks.remove(book);
    }

    // Method for get borrowedBooks
    public ArrayList<BookLibraryUsers> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Method to display borrowed books
    public void displayBorrowedBooks() {
        System.out.println("\nBorrowed books for " + name + ":");
        for (BookLibraryUsers book : borrowedBooks) {
            System.out.println("Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() + "\", Year: " + book.getPublicationYear());
        }
    }
}
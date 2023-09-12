package viikko_4.Task3_3.Task3_3_3.library.system;

// This class should manage the library's books and members.
// Implement methods to add books, add members, borrow books, and return books.

import viikko_4.Task3_3.Task3_3_3.library.model.Book;
import viikko_4.Task3_3.Task3_3_3.library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> members = new ArrayList<>();

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to add a library member
    public void addMember(LibraryMember member) {
        members.add(member);
    }

    // Method to allow a library member to borrow a book
    public void borrowBook(LibraryMember member, Book book) {
        if (books.contains(book)) {
            member.borrowBook(book);
            books.remove(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle() + "\n");
        } else {
            System.out.println("Book not available in the library.\n");
        }
    }

    // Method to allow a library member to return a book
    public void returnBook(LibraryMember member, Book book) {
        if (member.returnBook(book)) {
            books.add(book);
            System.out.println(member.getName() + " returned " + book.getTitle() + "\n");
        } else {
            System.out.println("Book not borrowed by " + member.getName());
        }
    }

    // Method to reserve a book
    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) { // Check if the book is not already reserved
            book.setReserved(true); // Mark the book as reserved
            member.addReservedBook(book); // Associate the book with the member
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    // Method to cancel a reservation
    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) { // Check if the book is reserved by the member
            book.setReserved(false); // Mark the book as not reserved
            member.removeReservedBook(book); // Remove the association with the member
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    // Method to display reserved books for a member
    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}


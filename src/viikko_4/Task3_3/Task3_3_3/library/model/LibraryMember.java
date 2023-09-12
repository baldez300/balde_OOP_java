package viikko_4.Task3_3.Task3_3_3.library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberId;
    private List<Book> borrowedBooks;
    private List<Book> reservedBooks = new ArrayList<>(); // List to store reserved books

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public boolean returnBook(Book book) {
        borrowedBooks.remove(book);
        return true;
    }

    // Method to add a reserved book to the list
    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    // Method to remove a reserved book from the list
    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    // Method to check if a member has reserved a specific book
    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    // Method to get the list of reserved books
    public List<Book> getReservedBooks() {
        return reservedBooks;
    }

    @Override
    public String toString() {
        return "Member Name: " + name + ", Member ID: " + memberId;
    }
}



package viikko_4.Task3_3.Task3_3_3.library.model;

/*
    Task 3: Implement Book Reservation

    Extend the existing library management system to include the ability to reserve books.
    When a library member requests to reserve a book, the system should mark the book as reserved
    and associate it with the member.
    The member should be able to see their reserved books and cancel reservations.

    Steps to Implement the Task:

    Modify the Book class in the model package to include a boolean reserved field.
    This field will indicate whether the book is currently reserved.

    Add methods to the Library class in the system package to handle book reservations.
    Implement methods to reserve a book, cancel a reservation, and display reserved books for a member.

    Update the LibraryMember class in the model package to include a list of reserved books.

    Modify the Main class to demonstrate the new functionality.
    Create instances of library members, reserve books, cancel reservations, and display reserved books.

    Example Implementation:

    package model;

    public class Book {
        // Existing fields: title, author, isbn
        private boolean reserved = false;

        // Getters, setters, other methods
    }

    package system;

    import model.Book;
    import model.LibraryMember;

    public class Library {
        // Existing methods: addBook, addMember, borrowBook, returnBook
        public void reserveBook(LibraryMember member, Book book) {
            if (!book.isReserved()) {
                book.setReserved(true);
                member.addReservedBook(book);
                System.out.println("Book reserved successfully.");
            } else {
                System.out.println("Book is already reserved.");
            }
        }

        public void cancelReservation(LibraryMember member, Book book) {
            if (book.isReserved() && member.hasReservedBook(book)) {
                book.setReserved(false);
                member.removeReservedBook(book);
                System.out.println("Reservation canceled successfully.");
            } else {
                System.out.println("Book was not reserved by this member.");
            }
        }

        public void displayReservedBooks(LibraryMember member) {
            System.out.println("Reserved books for " + member.getName() + ":");
            for (Book book : member.getReservedBooks()) {
                System.out.println(book.getTitle());
            }
        }
    }

    package model;

    import java.util.ArrayList;
    import java.util.List;

    public class LibraryMember {
        // Existing fields: name, memberId
        private List<Book> reservedBooks = new ArrayList<>();

        // Existing methods: getters, setters
        public void addReservedBook(Book book) {
            reservedBooks.add(book);
        }

        public void removeReservedBook(Book book) {
            reservedBooks.remove(book);
        }

        public boolean hasReservedBook(Book book) {
            return reservedBooks.contains(book);
        }

        public List<Book> getReservedBooks() {
            return reservedBooks;
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Existing code
            // Create instances of library members, reserve/cancel books, display reserved books
        }
    }
*/

// This class should have properties like title, author, and ISBN.

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean reserved = false; // Indicates whether the book is reserved

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters and setters for title, author, and isbn

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}


package viikko_4.Task3_3.Task3_3_2.library.model;

/*
    Task 2: Creating a Simple Library Management System

    In this exercise, you'll create a simple library management system using Java packages.
    You'll define classes within packages to represent books, library members, and the library itself.

    Step 1: Create Packages

    Create a new directory named library to serve as the root directory for your packages.

    Inside the library directory, create two subdirectories: model and system.

    Step 2: Define Classes

    Create a Book class inside the model package. This class should have properties like title, author, and ISBN.

    Create a LibraryMember class inside the model package.
    This class should represent a library member and have properties like name, member ID, and borrowed books.

    Create a Library class inside the system package. This class should manage the library's books and members.
    Implement methods to add books, add members, borrow books, and return books.

    Step 3: Implement Main Application

    Create a Main class outside the packages (in the root directory).
    In this class, create instances of the Library class, add books
    and members, and perform borrowing and returning operations.
    Here's a basic example of how the structure might look:

    library/
    |-- model/
    |   |-- Book.java
    |   |-- LibraryMember.java
    |-- system/
    |   |-- Library.java
    |-- Main.java
    Example Implementation:

    package model;

    public class Book {
        private String title;
        private String author;
        private String isbn;

        // Constructor, getters, setters
    }

    package model;

    public class LibraryMember {
        private String name;
        private int memberId;
        // List<Book> borrowedBooks

        // Constructor, getters, setters
    }

    package system;

    import model.Book;
    import model.LibraryMember;

    public class Library {
        // List<Book> books
        // List<LibraryMember> members

        public void addBook(Book book) {
            // Add book to the library
        }

        public void addMember(LibraryMember member) {
            // Add member to the library
        }

        public void borrowBook(LibraryMember member, Book book) {
            // Borrow book from the library
        }

        public void returnBook(LibraryMember member, Book book) {
            // Return book to the library
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Create instances of Library, Book, LibraryMember
            // Add books and members to the library
            // Perform borrowing and returning operations
        }
    }
*/

// This class should have properties like title, author, and ISBN.

public class Book {
    private String title;
    private String author;
    private String isbn;

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

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}


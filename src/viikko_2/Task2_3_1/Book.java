package viikko_2.Task2_3_1;

/*
    Task 1: Library and Books Association

    Exercise Description: In this exercise,
    you will create a Java program that demonstrates the concept of association between two classes: Library and Book.
    The program will model a library containing a collection of books.
    Each book will have a title, author, and publication year.
    The Library class will have methods to add books, display the list of books, and find books by a specific author.

    Instructions:

    Create a Java class named Book.

    Inside the Book class, declare private instance variables for the book's title, author, and publication year.
    Implement a constructor and getter methods to initialize and access these variables.

    Create another Java class named Library.

    Inside the Library class, declare an ArrayList to store Book objects.
    Use the following code to create the Library class:

    import java.util.ArrayList;

    public class Library {
        private ArrayList<Book> books = new ArrayList<>();

        // Add methods here
    }
    Implement the following methods inside the Library class:

    addBook(Book book):
    This method should add the given Book object to the library's collection.

    displayBooks():
    This method should display the details of all books in the library's collection,
    including their titles, authors, and publication years.

    findBooksByAuthor(String author):
    This method should search and display the details of books written by the specified author.

    Create a main method in a separate class
    (e.g., LibraryMain) to demonstrate the functionality of the Library and Book classes.
    In the main method, perform the following actions:

    Create instances of Book representing different books.
    Create an instance of Library.
    Add the book instances to the library.
    Display the list of all books in the library.
    Search for books by a specific author and display the results.
    Example Output:

    Library Catalog:
    1. Title: "Introduction to Java Programming", Author: "John Smith", Year: 2020
    2. Title: "Data Structures and Algorithms", Author: "Jane Doe", Year: 2018
    3. Title: "The Art of Fiction", Author: "Alice Johnson", Year: 2019

    Books by Author "Jane Doe":
    Title: "Data Structures and Algorithms", Year: 2018
*/

public class Book {
    // Private instance variables.
    private final String title;
    private final String author;
    private final int publicationYear;

    // Constructor
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

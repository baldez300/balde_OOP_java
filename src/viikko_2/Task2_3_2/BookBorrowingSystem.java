package viikko_2.Task2_3_2;

/*
    Task 2: Book Borrowing System

    Enhance the Library class to include a book borrowing system.
    Add the following methods:

    borrowBook(String title):
    This method should simulate a book being borrowed.
    It should remove the book from the library's collection if available.

    returnBook(Book book):
    This method should simulate a book being returned to the library.
    It should add the book back to the library's collection.
*/

public class BookBorrowingSystem {
    // Private instance variables.
    private final String title;
    private final String author;
    private final int publicationYear;

    // Constructor
    public BookBorrowingSystem(String title, String author, int publicationYear) {
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

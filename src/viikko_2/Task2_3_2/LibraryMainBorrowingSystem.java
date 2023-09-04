package viikko_2.Task2_3_2;

public class LibraryMainBorrowingSystem {
    public static void main(String[] args) {
        // Create instances of Book
        BookBorrowingSystem book1 = new BookBorrowingSystem("Introduction to Java Programming", "John Smith", 2020);
        BookBorrowingSystem book2 = new BookBorrowingSystem("Data Structures and Algorithms", "Jane Doe", 2018);
        BookBorrowingSystem book3 = new BookBorrowingSystem("The Art of Fiction", "Alice Johnson", 2019);

        // Create an instance of Library
        LibraryBorrowingSystem library = new LibraryBorrowingSystem();

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books in the library
        library.displayBooks();

        // Search for books by a specific author
        library.findBooksByAuthor("Jane Doe");


        // Borrow and return book ====
        library.borrowBook("Introduction to Java Programming");

        // Display again all books in the library
        library.displayBooks();

        // Return the book
        library.returnBook(book1);

        // Display again all books in the library
        library.displayBooks();
    }
}

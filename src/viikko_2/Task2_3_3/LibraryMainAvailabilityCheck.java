package viikko_2.Task2_3_3;

public class LibraryMainAvailabilityCheck {
        public static void main(String[] args) {
            // Create instances of Book
            BookAvailabilityCheck book1 = new BookAvailabilityCheck("Introduction to Java Programming", "John Smith", 2020);
            BookAvailabilityCheck book2 = new BookAvailabilityCheck("Data Structures and Algorithms", "Jane Doe", 2018);
            BookAvailabilityCheck book3 = new BookAvailabilityCheck("The Art of Fiction", "Alice Johnson", 2019);

            // Create an instance of Library
            LibraryAvailabilityCheck library = new LibraryAvailabilityCheck();

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

            // Check the availability of a specific book by its title
            System.out.println("\nIs the book \"Introduction to Java Programming\" available? " + library.isBookAvailable("Introduction to Java Programming"));
            System.out.println("Is the book \"Head First Java\" available? " + library.isBookAvailable("Head First Java"));

        }
}

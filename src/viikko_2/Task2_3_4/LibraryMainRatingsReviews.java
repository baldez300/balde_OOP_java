package viikko_2.Task2_3_4;

public class LibraryMainRatingsReviews {
    public static void main(String[] args) {
        // Create instances of Book
        BookRatingsReviews book1 = new BookRatingsReviews("Introduction to Java Programming", "John Smith", 2020);
        BookRatingsReviews book2 = new BookRatingsReviews("Data Structures and Algorithms", "Jane Doe", 2018);
        BookRatingsReviews book3 = new BookRatingsReviews("The Art of Fiction", "Alice Johnson", 2019);

        // Create an instance of Library
        LibraryRatingsReviews library = new LibraryRatingsReviews();

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

        // Rate and review a book
        book1.setRating(4.5);
        book1.addReview("This book is very good!");
        book1.addReview("I like this book.");

        // Display the rating and review of a book
        System.out.println("\nRating of the book \"" + book1.getTitle() + "\": " + book1.getRating() + " ⭐" );
        System.out.println("Review(s) of the book \"" + book1.getTitle() + "\": " + book1.getReviews());




    }
}

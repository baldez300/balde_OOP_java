package viikko_2.Task2_3_6;

// Modify the LibraryUsers class to keep track of library users and their borrowed books.

public class LibraryMainUsers {
    public static void main(String[] args) {
        // Create a new library
        LibraryUsers library = new LibraryUsers();

        // Create some books
        BookLibraryUsers book1 = new BookLibraryUsers("The Grapes of Java", "Kathy Sierra and Bert Bates", 2005);
        BookLibraryUsers book2 = new BookLibraryUsers("Head First Java", "Kathy Sierra and Bert Bates", 2003);
        BookLibraryUsers book3 = new BookLibraryUsers("Effective Java", "Joshua Bloch", 2008);
        BookLibraryUsers book4 = new BookLibraryUsers("Clean Code", "Robert C. Martin", 2008);
        BookLibraryUsers book5 = new BookLibraryUsers("Thinking in Java", "Bruce Eckel", 1998);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // Display all books in the library
        library.displayBooks();

        // Find books by author
        library.findBooksByAuthor("Joshua Bloch");

        // Create some users
        User user1 = new User("John Doe", 25);
        User user2 = new User("Alice Smith", 30);

        // Borrow books for users
        library.borrowBook("Clean Code", user1);
        library.borrowBook("The Grapes of Java", user2);

        // Display all books in the library
        library.displayBooks();

        // Display borrowed books for users
        user1.displayBorrowedBooks();
        user2.displayBorrowedBooks();

        // Return books for users
        library.returnBook(book1, user1);
        library.returnBook(book4, user2);

        /*
        // Display borrowed books for users again
        user1.displayBorrowedBooks();
        user2.displayBorrowedBooks();
        */

        // Display all books in the library
        library.displayBooks();

        // Check if a book is available
        System.out.println("\nIs \"Clean Code\" available? " + library.isBookAvailable("Clean Code"));
        System.out.println("Is \"Head First Java\" available? " + library.isBookAvailable("Head First Java"));

        // Rate and review for books
        book1.setRating(4.5);
        book1.addReview("Very good book!");
        book1.addReview("I like it!");

        book2.setRating(4.0);
        book2.addReview("Very good book!");

        book3.setRating(4.8);
        book3.addReview("Very good book!");
        book3.addReview("I like it!");
        book3.addReview("I like it so much!");

        book4.setRating(4.2);
        book4.addReview("Very good book!");

        book5.setRating(4.0);
        book5.addReview("Very good book!");

        // Display the rating and review of a book
        System.out.println("\nRating and review of \"" + book1.getTitle() + "\":");
        System.out.println("Rating: " + book1.getRating() + " ⭐");
        System.out.println("Review(s): " + book1.getReviews());

        // Calculate and display the average rating of all books in the library
        System.out.println("\nAverage rating of all books in the library: " + library.getAverageBookRating());

        // Display the book with the highest number of reviews
        System.out.println("\nBook with the highest number of reviews: " + library.getMostReviewedBook().getTitle());
    }
}


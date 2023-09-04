package viikko_2.Task2_3_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryUsers {
    private final List<BookLibraryUsers> books = new ArrayList<>();
    private final Map<User, List<BookLibraryUsers>> usersAndBorrowedBooks = new HashMap<>();

    public void addBook(BookLibraryUsers book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("\nLibrary Catalog:");
        for (int i = 0; i < books.size(); i++) {
            BookLibraryUsers book = books.get(i);
            System.out.println((i + 1) + ". Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() + "\", Year: " + book.getPublicationYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\":");
        for (BookLibraryUsers book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: \"" + book.getTitle() + "\", Year: " + book.getPublicationYear());
            }
        }
    }

    // Book borrowing and returning methods.
    public void borrowBook(String title, User user) {
        for (int i = 0; i < books.size(); i++) {
            BookLibraryUsers book = books.get(i);
            if (book.getTitle().equals(title)) {
                books.remove(i); // Remove the book from the library
                usersAndBorrowedBooks.computeIfAbsent(user, k -> new ArrayList<>()).add(book);
                System.out.println("\nBorrowed book: \"" + book.getTitle() + "\" by " + user.getName());
                return;
            }
        }
        System.out.println("\nThis book title : \"" + title + "\" is not available.");
    }

    public void returnBook(BookLibraryUsers book, User user) {
        books.add(book); // Add the book back to the library
        usersAndBorrowedBooks.getOrDefault(user, new ArrayList<>()).remove(book);
        System.out.println("\nReturned: \"" + book.getTitle() + "\" by " + user.getName());
    }

    // Method to check the availability of a specific book by its title:
    public boolean isBookAvailable(String title) {
        for (BookLibraryUsers book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    // Implement methods to calculate and display statistics about the books in the library:
    // Method to calculate and return the average rating of all books in the library.
    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0; // Handle the case when there are no books to avoid division by zero.
        }

        double sum = 0;
        for (BookLibraryUsers book : books) {
            sum += book.getRating();
        }
        return sum / books.size();
    }

    // Method to return the book with the highest number of reviews.
    public BookLibraryUsers getMostReviewedBook() {
        if (books.isEmpty()) {
            return null; // Handle the case when there are no books.
        }

        BookLibraryUsers mostReviewedBook = books.get(0);
        for (BookLibraryUsers book : books) {
            if (book.getReviews().size() > mostReviewedBook.getReviews().size()) {
                mostReviewedBook = book;
            }
        }
        return mostReviewedBook;
    }
}


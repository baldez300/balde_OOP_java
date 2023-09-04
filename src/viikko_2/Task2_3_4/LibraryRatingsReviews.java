package viikko_2.Task2_3_4;

import java.util.ArrayList;


public class LibraryRatingsReviews {
    private final ArrayList<BookRatingsReviews> books = new ArrayList<>();

    public void addBook(BookRatingsReviews book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("\nLibrary Catalog:");
        for (int i = 0; i < books.size(); i++) {
            BookRatingsReviews book = books.get(i);
            System.out.println((i + 1) +". Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() + "\", Year: " + book.getPublicationYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\":");
        for (BookRatingsReviews book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: \"" + book.getTitle() + "\", Year: " + book.getPublicationYear());
            }
        }
    }

    // Book borrowing and returning methods.
    public void borrowBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            BookRatingsReviews book = books.get(i);
            if (book.getTitle().equals(title)) {
                books.remove(i); // Remove the book from the library
                System.out.println("\nBorrowed book: \""+ book.getTitle() +"\"");
                return;
            }
        }
        System.out.println("\nThis book title : \""+ title +"\" is not available.");
    }

    public void returnBook(BookRatingsReviews book) {
        books.add(book); // Add the book back to the library
        System.out.println("\nReturned: \""+ book.getTitle()+"\"");
    }

    // Method to check the availability of a specific book by its title:
    public boolean isBookAvailable(String title) {
        for (BookRatingsReviews book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
}

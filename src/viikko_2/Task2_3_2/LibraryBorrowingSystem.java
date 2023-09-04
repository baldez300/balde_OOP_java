package viikko_2.Task2_3_2;

import java.util.ArrayList;

public class LibraryBorrowingSystem {
    private final ArrayList<BookBorrowingSystem> books = new ArrayList<>();

    public void addBook(BookBorrowingSystem book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("\nLibrary Catalog:");
        for (int i = 0; i < books.size(); i++) {
            BookBorrowingSystem book = books.get(i);
            System.out.println((i + 1) +". Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() + "\", Year: " + book.getPublicationYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\":");
        for (BookBorrowingSystem book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: \"" + book.getTitle() + "\", Year: " + book.getPublicationYear());
            }
        }
    }

    // Book borrowing and returning methods.
    public void borrowBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            BookBorrowingSystem book = books.get(i);
            if (book.getTitle().equals(title)) {
                books.remove(i); // Remove the book from the library
                System.out.println("\nBorrowed book: \""+ book.getTitle() +"\"");
                return;
            }
        }
        System.out.println("\nThis book title : \""+ title +"\" is not available.");
    }

    public void returnBook(BookBorrowingSystem book) {
        books.add(book); // Add the book back to the library
        System.out.println("\nReturned: \""+ book.getTitle()+"\"");
    }
}

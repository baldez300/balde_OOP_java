package viikko_4.Task3_3.Task3_3_2.library.system;

// This class should manage the library's books and members.
// Implement methods to add books, add members, borrow books, and return books.

import viikko_4.Task3_3.Task3_3_2.library.model.Book;
import viikko_4.Task3_3.Task3_3_2.library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to add a library member
    public void addMember(LibraryMember member) {
        members.add(member);
    }

    // Method to allow a library member to borrow a book
    public void borrowBook(LibraryMember member, Book book) {
        if (books.contains(book)) {
            member.borrowBook(book);
            books.remove(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle() + "\n");
        } else {
            System.out.println("Book not available in the library.\n");
        }
    }

    // Method to allow a library member to return a book
    public void returnBook(LibraryMember member, Book book) {
        if (member.returnBook(book)) {
            books.add(book);
            System.out.println(member.getName() + " returned " + book.getTitle() + "\n");
        } else {
            System.out.println("Book not borrowed by " + member.getName());
        }
    }
}


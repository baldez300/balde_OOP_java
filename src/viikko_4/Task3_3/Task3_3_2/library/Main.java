package viikko_4.Task3_3.Task3_3_2.library;

/*
    In this class, create instances of the Library class, add books
    and members, and perform borrowing and returning operations.

 */

import viikko_4.Task3_3.Task3_3_2.library.model.Book;
import viikko_4.Task3_3.Task3_3_2.library.model.LibraryMember;
import viikko_4.Task3_3.Task3_3_2.library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Book 1", "Author 1", "ISBN-123");
        Book book2 = new Book("Book 2", "Author 2", "ISBN-456");
        Book book3 = new Book("Book 3", "Author 3", "ISBN-789");

        LibraryMember member1 = new LibraryMember("Member 1", 1);
        LibraryMember member2 = new LibraryMember("Member 2", 2);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook(member1, book1);
        library.borrowBook(member2, book1);
        library.returnBook(member1, book1);

        library.borrowBook(member2, book3);
        library.returnBook(member2, book3);
    }
}







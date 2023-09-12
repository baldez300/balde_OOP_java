package viikko_4.Task3_3.Task3_3_3.library;

/*
    In this class, create instances of the Library class, add books
    and members, and perform borrowing and returning operations.

 */

import viikko_4.Task3_3.Task3_3_3.library.model.Book;
import viikko_4.Task3_3.Task3_3_3.library.model.LibraryMember;
import viikko_4.Task3_3.Task3_3_3.library.system.Library;

public class Main {
    public static void main(String[] args) {
        // Existing code: Create instances of library members and add them to the library
        LibraryMember member1 = new LibraryMember("John", 101);
        LibraryMember member2 = new LibraryMember("Alice", 102);
        Library library = new Library();

        library.addMember(member1);
        library.addMember(member2);

        // Existing code: Create instances of books and add them to the library
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
        Book book3 = new Book("1984", "George Orwell", "978-0-452-28423-4");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Existing code: Borrow books and display member info
        library.borrowBook(member1, book1);
        library.borrowBook(member1, book2);
        library.borrowBook(member2, book2);

        System.out.println("Member " + member1.getName() + " borrowed books: " + member1.getBorrowedBooks());
        System.out.println("Member " + member2.getName() + " borrowed books: " + member2.getBorrowedBooks());

        // New code: Reserve books and display reserved books
        library.reserveBook(member1, book3);
        library.reserveBook(member2, book1);

        System.out.println("Member " + member1.getName() + " reserved books: " + member1.getReservedBooks());
        System.out.println("Member " + member2.getName() + " reserved books: " + member2.getReservedBooks());

        // New code: Cancel reservations and display reserved books
        library.cancelReservation(member1, book3);
        library.cancelReservation(member2, book1);

        System.out.println("Member " + member1.getName() + " reserved books after canceling: " + member1.getReservedBooks());
        System.out.println("Member " + member2.getName() + " reserved books after canceling: " + member2.getReservedBooks());
    }
}








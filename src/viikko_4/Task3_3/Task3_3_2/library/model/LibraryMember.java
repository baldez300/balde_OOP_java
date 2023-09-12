package viikko_4.Task3_3.Task3_3_2.library.model;

import java.util.List;

// This class should represent a library member
// and have properties like name, member ID, and borrowed books.

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberId;
    private List<Book> borrowedBooks;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public boolean returnBook(Book book) {
        borrowedBooks.remove(book);
        return true;
    }

    @Override
    public String toString() {
        return "Member Name: " + name + ", Member ID: " + memberId;
    }
}



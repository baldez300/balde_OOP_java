package viikko_2.Task2_3_3;

/*
    Task 3: Book Availability Check

    Add a method to the Library class to check the availability of a specific book by its title:

    isBookAvailable(String title):
    This method should return a boolean indicating whether the book with the specified title is available in the library.
*/

public class BookAvailabilityCheck {
    // Private instance variables.
    private final String title;
    private final String author;
    private final int publicationYear;

    // Constructor
    public BookAvailabilityCheck(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

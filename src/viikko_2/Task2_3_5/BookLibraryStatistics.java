package viikko_2.Task2_3_5;

/*
    Task 5: Library Statistics

    Implement methods in the Library class to calculate and display statistics about the books in the library:

    getAverageBookRating():
    This method should calculate and return the average rating of all books in the library.

    getMostReviewedBook():
    This method should return the book with the highest number of reviews.
*/

import java.util.ArrayList;

public class BookLibraryStatistics {
    // Private instance variables.
    private final String title;
    private final String author;
    private final int publicationYear;
    private double rating;
    private final ArrayList<String> reviews;

    // Constructor
    public BookLibraryStatistics(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.rating = 0.0; // Initialize the rating to 0
        this.reviews = new ArrayList<>(); // Initialize the reviews list
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

    // Setter for rating
    public void setRating(double rating) {
        this.rating = rating;
    }

    // Method to add a review
    public void addReview(String review) {
        reviews.add(review);
    }


    // Method for get rating
    public double getRating() {
        return rating;
    }

    // Method for get reviews
    public ArrayList<String> getReviews() {
        return reviews;
    }

}

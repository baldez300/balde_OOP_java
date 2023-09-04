package viikko_2.Task2_3_4;

/*
    Task 4: Book Ratings and Reviews

    Extend the Book class to include a rating and review system.
    Add the following methods:

    setRating(double rating): This method should set the rating of the book.

    addReview(String review): This method should add a review to the book.
*/

import java.util.ArrayList;

public class BookRatingsReviews {
    // Private instance variables.
    private final String title;
    private final String author;
    private final int publicationYear;
    private double rating;
    private final ArrayList<String> reviews;

    // Constructor
    public BookRatingsReviews(String title, String author, int publicationYear) {
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

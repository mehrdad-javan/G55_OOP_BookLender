package se.lexicon.model;


import java.util.Objects;
import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {

    private final String id;
    private final String title;
    private final String author;
    private boolean available;
    private Person borrower;


    // Constructor
    public Book(String id, String title, String author) {
        this.id = UUID.randomUUID().toString();
        this.title = Objects.requireNonNull(title, "Title cannot be empty/null.");
        this.author = Objects.requireNonNull(author, "Author cannot be empty/null.");
        this.available = true;
    }

// Getters and Setters

    public Book(String title, String author, Person borrower) {
        this(title, author);
        setBorrower(borrower);
    }

    public String getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
        this.available = (borrower == null);
    }

    public String getBookInformation() {
        String borrowerInfo = borrower != null ? " PersonId: " + borrower.getId() : "-";
        return String.format("Book{ id=%s, title=%s, author=%s, available=%b, borrower=%s }", id, title, author, available, borrowerInfo);
    }
}
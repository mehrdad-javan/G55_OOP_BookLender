package se.lexicon.model;


import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        this.id = UUID.randomUUID().toString();
        setTitle(title);
        setAuthor(author);
    }

    public Book(String title, String author, Person borrower) {
        this(title, author);
        setBorrower(borrower);
    }

    public String getId() {
        return id;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty())
            throw new IllegalArgumentException("Title cant be null or empty");

        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty())
            throw new IllegalArgumentException("Author cant be null or empty");

        this.author = author;
    }

    public boolean isAvailable() {
        if (getBorrower() == null) {
            setAvailable(true);
            return this.available;
        }
        this.setAvailable(false);
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBookInformation() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Book Name: ").append(getTitle()).append("\n").append("Book Author: ").append(getAuthor()).append("\n");

        String bookAvailability = isAvailable() ? "Can be loaned " : "Loaned by: " + getBorrower().getFirstName() + " " + getBorrower().getLastName();

        stringBuilder.append(bookAvailability);

        return stringBuilder.toString();
    }
}
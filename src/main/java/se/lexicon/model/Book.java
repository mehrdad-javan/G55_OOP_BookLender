package se.lexicon.model;


/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
    }

    public Book(String title, String author, Person borrower) {
        this(title, author);
        setBorrower(borrower);
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
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        if (getBorrower() == null) {
            return true;
        }
        return false;
    }

    public String getBookInformation() {
        return "Text to return";
    }
}
package se.lexicon.model;


/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // todo: needs completion

    private int id;
    private String title;
    private String author;
    private String isbn;

}

// Constructor
public Book(int id, String title, String author, String isbn) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.isbn = isbn;
}

public Book(String title, String author,String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
}

// Getters and Setters


package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    private static int sequencer = 0;
    private final int id;
    private String firstName;
    private String lastName;
    private final List<Book> loanedBooks;

    public Person(String firstName, String lastName) {
        this.id = getNextId();
        setFirstName(firstName);
        setLastName(lastName);
        this.loanedBooks = getLoanedBooks() != null ? getLoanedBooks() : new ArrayList<>();
    }

    public List<Book> getLoanedBooks() {
        return loanedBooks;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) throw new IllegalArgumentException("Can't be null or empty");

        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty())
            throw new IllegalArgumentException("Cant be null or empty");

        this.firstName = firstName;
    }

    private static int getNextId() {
        return ++sequencer;
    }

    public void loanBook(Book book) {
        if (book.isAvailable()) {
            System.out.println("Book has been loaned.");
            book.setBorrower(this);
        }
        if (getLoanedBooks().contains(book)) {
            System.out.println("You have already this book loaned.");
        } else {
            getLoanedBooks().add(book);
        }
        System.out.println("Cant loan Book");
    }

    public void returnBook(Book book) {
        if (book.getBorrower() == null) {
            System.out.println("This book hasn't been borrowed by anyone.");
        } else if (book.getBorrower().getId() != getId()) {
            System.out.println("Its not your book to return");
        } else {
            getLoanedBooks().remove(book);
            book.setBorrower(null);
            System.out.println("Book successfully returned.");
        }
    }

    public void printAllLoanedBooks() {
        for (Book books : getLoanedBooks()) {
            System.out.println(books.getBookInformation());
        }
    }

    public String getPersonInformation() {
        return "Name: " + getFirstName() + getLastName();
    }
}
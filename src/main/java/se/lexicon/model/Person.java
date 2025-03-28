package se.lexicon.model;

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
//    private Book[] books;


    public Person(String firstName, String lastName) {
        this.id = getNextId();
        setFirstName(firstName);
        setLastName(lastName);
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
        } else {
            System.out.println("Book not Available");
        }
    }

    public void returnBook(Book book) {
        if (book.getBorrower() == null) {
            System.out.println("This book hasn't been borrowed by anyone.");
        } else if (book.getBorrower().getId() != getId()) {
            System.out.println("Its not your book to return");
        } else {
            book.setBorrower(null);
            System.out.println("Book successfully returned.");
        }
    }

    public String getPersonInformation() {
        return "Name: " + getFirstName() + getLastName();
    }
}
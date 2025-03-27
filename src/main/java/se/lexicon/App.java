package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {

        Person testPerson = new Person("Test", "Testison");
        Person gentritPersoni = new Person("Gentrit", "Hoti");
        Book testisBook = new Book("Test Title", "Testi", testPerson);
        Book gentritsBook = new Book("Book1", "Author1");

        System.out.println("Should be true: " + gentritsBook.isAvailable());

        gentritPersoni.loanBook(gentritsBook);

        System.out.println("Should be false: " + gentritsBook.isAvailable());

        gentritPersoni.returnBook(gentritsBook);
        gentritPersoni.loanBook(testisBook);

        System.out.println("Book has been returned should be true : " + gentritsBook.isAvailable());


        System.out.println(testisBook.isAvailable());

        testPerson.returnBook(testisBook);

        System.out.println("Returned testis book should be true: " + testisBook.isAvailable());

        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book

    }

}

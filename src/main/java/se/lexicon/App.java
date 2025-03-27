package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {

        Person testPerson = new Person("Test", "Testison");
        Book testisBook = new Book("Test Title", "Testi", testPerson);
        Person gentritPersoni = new Person("Gentrit", "Hoti");
        Book gentritsBook = new Book("Book1", "Author1");

        testPerson.loanBook(testisBook);
        gentritPersoni.loanBook(gentritsBook);

        System.out.println(testisBook.getBookInformation());

        Book setburrowTest = new Book("Burrow", "Burrowso");
        System.out.println(setburrowTest.getBorrower());

        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book

    }

}

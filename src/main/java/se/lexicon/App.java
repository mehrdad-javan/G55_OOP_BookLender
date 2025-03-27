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

//        System.out.println("Should be false: " + gentritsBook.isAvailable());

//        gentritPersoni.returnBook(gentritsBook);
//        gentritPersoni.returnBook(testisBook);

//        System.out.println("Book Gentrit has been returned should be true : " + gentritsBook.isAvailable());

        System.out.println(testisBook.getBookInformation());

//        testPerson.returnBook(testisBook);
//
//        System.out.println("Returned testis book should be true: " + testisBook.isAvailable());

        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book

    }

}

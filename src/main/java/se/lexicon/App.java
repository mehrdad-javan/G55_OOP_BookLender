package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {

        Person gentritPersoni = new Person("Gentrit", "Hoti");
        Book gentritsBook = new Book("Book1", "Author1");

        System.out.println("Should be true: " + gentritsBook.isAvailable());

        gentritPersoni.loanBook(gentritsBook);

        System.out.println("Should be false: " + gentritsBook.isAvailable());

        gentritPersoni.returnBook(gentritsBook);

        System.out.println("Book has been returned should be false : " + gentritsBook.isAvailable());

        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book

    }

}

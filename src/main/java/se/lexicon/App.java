package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // Initialize and display Book & Person instances
        Person gentritPerson = new Person("Gentrit", "Hoti");
        Person testPerson = new Person("Test", "Testison");

        Book bookOne = new Book(" The Time Machine by H. G. Wells", "H.G.Wells");
        Book bookTwo = new Book("The Stand", "Stephen King");
        Book bookThree = new Book("The Hitchhiker's Guide to the Galaxy ", "Douglas Adams");
        Book bookFour = new Book("To Kill a Mockingbird", "Harper Lee", testPerson);
        Book bookFive = new Book("The Lord of the Rings", "John Ronald Reuel Tolkien");

        // Simulate borrowing a book


        // Simulate returning a book

    }

}

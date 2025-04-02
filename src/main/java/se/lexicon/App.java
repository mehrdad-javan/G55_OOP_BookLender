package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // Initialize and display Book & Person instances
        //Persons
        Person gentritPerson = new Person("Gentrit", "Hoti");
        Person testPerson = new Person("Test", "Testison");



        //Books
        Book bookOne = new Book(" The Time Machine by H. G. Wells", "H.G.Wells");
        Book bookTwo = new Book("The Stand", "Stephen King");
        Book bookThree = new Book("The Hitchhiker's Guide to the Galaxy ", "Douglas Adams", testPerson);
        Book bookFour = new Book("To Kill a Mockingbird", "Harper Lee", testPerson);
        Book bookFive = new Book("The Lord of the Rings", "John Ronald Reuel Tolkien");

        // Simulate borrowing a book
        System.out.println("---------------------------------------");
        System.out.println("         Borrowing          ");
        System.out.println("Loan function runs...");
        gentritPerson.loanBook(bookOne);
        System.out.println(bookOne.getBookInformation());
        System.out.println("---------------------------------------");

//        gentritPerson.loanBook(bookOne);

        gentritPerson.printAllLoanedBooks();

        // Simulate returning a book
//        System.out.println("---------------------------------------");
//
//        System.out.println("         Returning Book          ");
//        System.out.println("Return function runs...");
//        gentritPerson.returnBook(bookOne);
//        System.out.println(bookOne.getBookInformation());
//        System.out.println("---------------------------------------");
//
//
//        //Simulate other person Loaning after returned
//        System.out.println("---------------------------------------");
//        System.out.println("         Other person borrows          ");
//        System.out.println("Loan function runs...");
//        testPerson.loanBook(bookOne);
//        System.out.println(bookOne.getBookInformation());
//        System.out.println("----------------------------------------");
//
//        //Simulate other person loaning the same book CAN't
//        System.out.println("---------------------------------------");
//        System.out.println("         Other person borrows          ");
//        System.out.println("Loan function runs...");
//        gentritPerson.loanBook(bookOne);
//        System.out.println(bookOne.getBookInformation());
//        System.out.println("----------------------------------------");

    }

}

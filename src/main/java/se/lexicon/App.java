package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {

        // Book Instances
        Book book1 = new Book("A Court of Thorns and Roses", "Sarah J Maas");
        Book book2 = new Book("A Court of Mist and Fury", "Sarah J Maas");
        Book book3 = new Book("A Court of Wings and Ruin", "Sarah J Maas");
        Book book4 = new Book("A Court of Frost and Starlight", "Sarah J Maas");
        Book book5 = new Book("A Court of Silver Flames", "Sarah J Maas");
        Book book6 = new Book("The Constant Princess", "Philippa Gregory");
        Book book7 = new Book("The Other Boleyn Girl", "Philippa Gregory");
        Book book8 = new Book("The Boleyn Inheritance", "Philippa Gregory");
        Book book9 = new Book("The Virgin's Lover", "Philippa Gregory");
        Book book10 = new Book("The Other Queen", "Philippa Gregory");
        Book book11 = new Book("The Queen's Fool", "Philippa Gregory");


        // Display Book Info
        System.out.println("Book information:");
        System.out.println(book1.getBookInformation());
        System.out.println(book2.getBookInformation());
        System.out.println(book3.getBookInformation());
        System.out.println(book4.getBookInformation());
        System.out.println(book5.getBookInformation());
        System.out.println(book6.getBookInformation());
        System.out.println(book7.getBookInformation());
        System.out.println(book8.getBookInformation());
        System.out.println(book9.getBookInformation());
        System.out.println(book10.getBookInformation());
        System.out.println(book11.getBookInformation());


        // Person Instances
        Person person1 = new Person("Lana", "Brokaw");
        Person person2 = new Person("Monica", "Björk");
        Person person3 = new Person("Agnes", "Nazie");

        // Display Person Info
        System.out.println("Person information:");
        System.out.println(person1.getPersonInformation());
        System.out.println(person2.getPersonInformation());
        System.out.println(person3.getPersonInformation());
        System.out.println();

        //Loan A Book
        person1.loanBook(book1);

        // Display Person's Borrowing Info
        System.out.println("User's borrowing history: ");
        System.out.println(person1.getPersonInformation);
        System.out.println();

        // Display Book's borrowing history
        System.out.println("Book's borrowing history: ");
        System.out.println(book1.getBookInformation());
        System.out.println(book2.getBookInformation());
        System.out.println();

        // Return Borrowed Book
        person1.returnBook(book1);

        // Display Person's Return Info
        System.out.println("User's Return History: ");
        System.out.println(person1.getPersonInformation());
    }

}

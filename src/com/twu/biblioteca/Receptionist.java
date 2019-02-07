package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

public class Receptionist {

//    private PrintStream printStream;

    public void greetCustomer() {
        System.out.println("Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!");
    }

    public void showBooksToCustomer() {
        Library library = new Library();
        List<Book> listOfBooks = library.getListOfBooks();

        for (Book book: listOfBooks) {
            System.out.println(book.getTitle() + book.getAuthor() + book.getYear());
        }
    }



}

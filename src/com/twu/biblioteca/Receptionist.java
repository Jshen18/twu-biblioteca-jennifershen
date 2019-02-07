package com.twu.biblioteca;

import java.util.List;

public class Receptionist {

    public void greetCustomer() {
        System.out.println("Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!");
    }

    public void showBooksToCustomer() {
        Library books = new Library();
        List<Book> listOfBooks = books.getListOfBooks();

        for (Book book: listOfBooks) {
            System.out.println(book);
        }
    }
}

package com.twu.biblioteca;

public class Receptionist {

    public void greetCustomer() {
        System.out.println("Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!");
    }

    public void showBooksToCustomer() {
        Library books = new Library();
        String[] listOfBooks = books.getListOfBooks();

        for (String book: listOfBooks) {
            System.out.println(book);
        }
    }
}

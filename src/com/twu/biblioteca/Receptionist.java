package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

public class Receptionist {

//    private PrintStream printStream;

    public void greetCustomer() {
        System.out.println("Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!");
    }

    public void showOptionsToCustomer() {

        System.out.println("1: List of Books");
        System.out.println("2: Choice 2");
        System.out.println("3: Choice 3");
        System.out.println("4: Quit Biblioteca");

        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    this.showBooksToCustomer();
                    break;

                case 2:
                    System.out.println("choice 2");
                    break;
                case 3:
                    System.out.println("choice 3");
                    break;
                case 4:
                    System.out.println("QUIT");
                    break;

                default:
                    System.out.println("Please Select a valid option!");

            }

        } while (userInput != 4);

    }

    public void showBooksToCustomer() {
        Library library = new Library();
        List<Book> listOfBooks = library.getListOfBooks();

        for (Book book: listOfBooks) {
            System.out.println(book.getTitle() + book.getAuthor() + book.getYear());
        }
    }



}

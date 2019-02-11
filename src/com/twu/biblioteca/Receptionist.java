package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

public class Receptionist {

    private Library library;
    private PrintStream printStream;

    Scanner scanner = new Scanner(System.in);

    public Receptionist(PrintStream printStream, Library library) {
        this.printStream = printStream;
        this.library = library;
    }


    public void greetCustomer() {
        printStream.println("Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!");
    }

    public void showOptionsToCustomer() {

        printStream.println("1: List of Books");
        printStream.println("2: Checkout Book by Title");
        printStream.println("3: Return Book by Title");
        printStream.println("4: Movie Selections");
        printStream.println("5: Checkout Movie by Name");
        printStream.println("7: Quit Biblioteca");

        int userInput;
        do {
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    this.showBooksToCustomer();
                    break;

                case 2:
                    printStream.println("Enter Book Title to Checkout");
                    this.checkoutBook();
                    break;
                case 3:
                    printStream.println("Enter Book Title to Return");
                    this.returnBooks();
                    break;
                case 4:
                    this.showMoviesToCustomer();
                    break;
                case 5:
                    printStream.println("Enter Movie Name to Checkout");
                    this.checkoutMovie();
                    break;
                case 6:
                    printStream.println("QUIT");
                    break;

                default:
                    printStream.println("Please Select a valid option!");

            }

        } while (userInput != 7);

    }

    public void showMoviesToCustomer() {
        List<Movie> listOfMovies = this.library.getListOfMovies();
        for (Movie movie: listOfMovies) {
            printStream.println(movie.getName() + movie.getDirector() + movie.getYear() + movie.getRating());
        }
    }

    public void checkoutMovie() {
        this.library.checkoutMovie();
    }

    public void showBooksToCustomer() {
        List<Book> listOfBooks = this.library.getListOfBooks();

        for (Book book: listOfBooks) {
            printStream.println(book.getTitle() + book.getAuthor() + book.getYear());
        }
    }

    public void checkoutBook() {
        this.library.checkoutBooks();

    }

    public void returnBooks() {
        this.library.returnBooks();
    }


}

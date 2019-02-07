package com.twu.biblioteca;

import java.nio.file.Files;

public class BibliotecaApp {

    public static void main(String[] args) {

        Receptionist reception = new Receptionist();
        reception.greetCustomer();
        reception.showBooksToCustomer();


    }
}

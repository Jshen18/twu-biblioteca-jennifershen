package com.twu.biblioteca;

import java.nio.file.Files;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Receptionist reception = new Receptionist();
        reception.greetCustomer();
        reception.showOptionsToCustomer();


    }

}

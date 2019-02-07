package com.twu.biblioteca;

import java.nio.file.Files;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Receptionist reception = new Receptionist();
//        reception.greetCustomer();
//        reception.showBooksToCustomer();
        System.out.println("List of Books");


        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        switch (userInput) {
            case "one":
                reception.showBooksToCustomer();
                break;

            case "two":
                System.out.println("PRINT CASE 2");
                break;

            default:
                System.out.println("DEFAULT");

        }

    }

}

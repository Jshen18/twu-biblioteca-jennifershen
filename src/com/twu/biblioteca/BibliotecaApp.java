package com.twu.biblioteca;

import java.nio.file.Files;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Receptionist reception = new Receptionist();
//        reception.greetCustomer();
//        reception.showBooksToCustomer();
        System.out.println("1: List of Books");


        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
                reception.showBooksToCustomer();
                break;

            case 2:
                System.out.println("PRINT CASE 2");
                break;

            default:
                System.out.println("Please Select a valid option!");

        }

    }

}

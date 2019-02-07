package com.twu.biblioteca;

import java.nio.file.Files;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Receptionist reception = new Receptionist();
//        reception.greetCustomer();
//        reception.showBooksToCustomer();
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
                    reception.showBooksToCustomer();
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

}

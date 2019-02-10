package com.twu.biblioteca;


public class BibliotecaApp {

    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("MAIN");
        Receptionist reception = new Receptionist(System.out, library);
        reception.greetCustomer();
        reception.showOptionsToCustomer();



    }

}

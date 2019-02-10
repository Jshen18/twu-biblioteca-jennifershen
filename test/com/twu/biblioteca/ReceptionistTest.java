package com.twu.biblioteca;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class ReceptionistTest {

//    @Test
//    public void testGreet() {
//
//        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//        System.setOut( new PrintStream(outContent));
//        Receptionist greet = new Receptionist();
//        greet.greetCustomer();
//        assertEquals(outContent.toString(), "Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!\n");
//    }


    @Test
    public void greetingTest() {
        Library library = new Library();
        PrintStream printStream = mock(PrintStream.class);
        Receptionist greetingPrinter = new Receptionist(printStream, library);

        greetingPrinter.greetCustomer();

        verify(printStream).println( "Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!");
    }

//    @Test
//    public void showOptionsToCustomer_input1_shouldShowList() {
//        Scanner mockScanner = mock(Scanner.class);
//        when(mockScanner.nextInt()).thenReturn(2);
//
//        Receptionist receptionist = new Receptionist(mockScanner);
//        assertEquals(1, receptionist.showOptionsToCustomer());
//    }


}



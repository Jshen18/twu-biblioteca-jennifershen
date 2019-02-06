package com.twu.biblioteca;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ReceptionistTest {
    @Test
    public void testGreet() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut( new PrintStream(outContent));
        Receptionist greet = new Receptionist();
        greet.greetCustomer();
        assertEquals(outContent.toString(), "Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!\n");
    }
}


//public class ExampleTest {
//
//    @Test
//    public void test() {
//        assertEquals(1, 1);
//    }
//}

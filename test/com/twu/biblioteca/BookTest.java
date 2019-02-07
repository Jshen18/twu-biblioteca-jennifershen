package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


//MethodName_StateUnderTest_ExpectedBehavior

public class BookTest {

    @Test
    public void getBooks_length_4() {
        Book books = new Book();
        assertEquals(books.getBooks().length,4);
    }

}

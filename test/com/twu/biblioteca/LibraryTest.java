package com.twu.biblioteca;


//arrange action assert

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {


    //test get books, just title
    @Test
    public void getBooks_shouldHaveTitles() {
        Library library = new Library();
        List<Book> books = library.getListOfBooks();

        assertEquals(books.size(), 4);
        assertEquals(books.get(0).getTitle(), "Harry Potter and the Chamber of Secrets");


    }


    //test get authors and year

}

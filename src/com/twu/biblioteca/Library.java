package com.twu.biblioteca;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    public String[] getListOfBooks() {
        Book books = new Book();
        String[] listOfBooks = books.getBooks();
        return listOfBooks;
    }

}

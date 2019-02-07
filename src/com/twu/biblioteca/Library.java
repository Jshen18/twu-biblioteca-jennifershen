package com.twu.biblioteca;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//add book variable

public class Library {

    String[] books = new String[]{"Harry Potter and the Chamber of Secrets | J.K. Rowling | 2005\n", "The Water Cure |  Sophie Mackintosh | 2019\n", "Black Leopard, Red Wolf |  Marlon James |  2019\n", "Where Reasons End |  Yiyun Li | 2018"};


    public List<Book> getListOfBooks() {
        List<Book> listOfBooks = new ArrayList<>();

       for (String rawBook : books ) {
           String[] bookDetails = rawBook.split(" \\| ");
           Book book = new Book(bookDetails[0], bookDetails[1], bookDetails[2]);
           listOfBooks.add(book);
       }
        return listOfBooks;
    }


}

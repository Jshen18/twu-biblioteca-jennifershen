package com.twu.biblioteca;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//add book variable

public class Library {


    private ArrayList<String> books = new ArrayList<String>( Arrays.asList("Harry Potter and the Chamber of Secrets | J.K. Rowling | 2005\n", "The Water Cure |  Sophie Mackintosh | 2019\n", "Black Leopard, Red Wolf |  Marlon James |  2019\n", "Where Reasons End |  Yiyun Li | 2018"));
    private ArrayList<String> checkedOutBooks = new ArrayList<>();

    public List<Book> getListOfBooks() {
        List<Book> listOfBooks = new ArrayList<>();
       for (String rawBook : books ) {
           String[] bookDetails = rawBook.split(" \\| ");
           Book book = new Book(bookDetails[0], bookDetails[1], bookDetails[2]);
           listOfBooks.add(book);
       }
        return listOfBooks;
    }

    public void returnBooks() {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        if (checkedOutBooks.size() > 0) {
            for (int i = 0; i < checkedOutBooks.size(); i ++) {
                String title = checkedOutBooks.get(i).split(" \\|")[0];
                if (title.equals(userInput)) {
                    System.out.println("Thank you for returning the book!");
                    books.add(checkedOutBooks.get(i));
                    checkedOutBooks.remove(i);
                    break;
                }
            }

        }
    }

    public boolean checkoutBooks() {

        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        Boolean found = false;

        for (int i = 0; i < books.size() ; i++) {
            String title = books.get(i).split(" \\|")[0];
            if (title.equals(userInput)){
                System.out.println("Thank you enjoy the book!");
                checkedOutBooks.add(books.get(i));
                books.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Sorry, that book is not available");
        }
        return found;
    }
}

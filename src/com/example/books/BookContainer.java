package com.example.books;

import java.util.ArrayList;

public interface BookContainer {
    public void addBook(Book book);
    public ArrayList<Book> getBooks();
}

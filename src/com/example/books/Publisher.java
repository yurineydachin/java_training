package com.example.books;

import java.util.ArrayList;

public class Publisher implements BookContainer {
    public int id;
    public String name;
    public  int pagePrice;
    ArrayList<Book> books = new  ArrayList<Book>();

    public Publisher(int id, String name, int pagePrice){
        this.id = id;
        this.name = name;
        this.pagePrice = pagePrice;
    }
    public void addBook(Book book){
        this.books.add(book);
    }
    public ArrayList<Book> getBooks(){
        return this.books;
    }

}

package com.example.books;

import java.util.ArrayList;

public class Publisher implements BookContainer {
    private int id;
    private String name;
    private   int pagePrice;
    private ArrayList<Book> books = new  ArrayList<Book>();

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
    public static Publisher getPublisher(int publisherId){
        return Library.publishersMap.get(publisherId);
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getPagePrice(){
        return this.pagePrice;
    }
}

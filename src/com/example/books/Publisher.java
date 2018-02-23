package com.example.books;

import java.util.ArrayList;

public class Publisher implements BookContainer {
    private int id;
    private String name;
    private   int pagePrice;
    private ArrayList<Book> books = new  ArrayList<>();

    public Publisher(int id, String name, int pagePrice){
        this.id = id;
        this.name = name;
        this.pagePrice = pagePrice;
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
    public void addBook(Book book){
        this.books.add(book);
    }
    public ArrayList<Book> getBooks(){
        return this.books;
    }
    public String toString(){
        if (name != null && id != 0) {
            return "Publisher " + id + ": " + name;
        }
        return "Publisher is empty";
    }


}

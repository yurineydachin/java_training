package com.example.books;

import java.util.ArrayList;

public class BookContainer {
    private int id;
    private String name;
    private ArrayList<Book> books = new  ArrayList<>();

    public BookContainer(int id, String name){
        this.id = id;
        this.name = name;

    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void addBook(Book book){
        this.books.add(book);
    }
    public ArrayList<Book> getBooks(){
        return this.books;
    }
    public String toString(){
        if (name != null && id != 0) {
            return this.getClass().getName() + id + ": " + name;
        }
        return this.getClass().getName() +  " is empty";
    }
}

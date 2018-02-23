package com.example.books;

import java.util.ArrayList;

public class Author implements BookContainer{
    private int id;
    private String name;
    private ArrayList<Book> books = new ArrayList<>();


    public Author(int id, String name){
        this.name = name;
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void addBook( Book book){
        this.books.add(book); }

    public  ArrayList<Book> getBooks() {
        return  this.books;
    }

    public String toString(){
        if (name != null && id != 0) {
            return "Author " + id + ": " + name;
        }
        return "Author is empty";
    }
}
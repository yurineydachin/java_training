package com.example.books;

import java.util.ArrayList;

public class Author implements BookContainer{
    public int id;
    public String name;
    private ArrayList<Book> books = new ArrayList<Book>();
    public Author(int id, String name){
        this.name = name;
        this.id = id;
    }
    public void addBook( Book book){
        this.books.add(book);
       // acountSalaryForBook( book);
    }



    public  ArrayList<Book> getBooks() {
        return  this.books;
    }
}
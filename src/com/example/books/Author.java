package com.example.books;

import java.util.ArrayList;

public class Author implements BookContainer{
    private int id;
    private String name;
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
    public static Author getAuthor(int authorId){

        return Library.authorsMap.get(authorId);
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}
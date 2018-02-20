package com.example.books;

import java.util.ArrayList;

public class Category implements BookContainer {
    private   String name;
    private   int id;
    private ArrayList books = new ArrayList();

    public Category(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void addBook(Book b){
        this.books.add(b);
    }
    public ArrayList<Book> getBooks(){
        return this.books;
    }
    public int booksCount(){
       return getBooks().size();

    }
    public static Category getCategory(int categoryId){
        return Library.categoryMap.get(categoryId);
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

}

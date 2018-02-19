package com.example.books;

import java.util.ArrayList;

public class Category implements BookContainer {
    public  String name;
    public  int id;
    public ArrayList books = new ArrayList();

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

    public static void setBooks( ArrayList<Category> categoryList, ArrayList<Book> bookList ){
        for ( Book b: bookList){
            for (Category c: categoryList){
                if(b.categoryId == c.id){
                    c.addBook(b);
                }
            }
        }
    }
}

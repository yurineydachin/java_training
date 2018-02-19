package com.example.books;

public class Book {

    public  String name;
    public  int year;
    public Author author;
    public  String category;
    public  int categoryId;
    public int pageCount;
    public  Publisher publisher;

    public  Book(String name, int year, Author author, String category, int categoryId, int pageCount, Publisher publisher ){
        this.name = name;
        this.year = year;
        this.author = author;
        this.category = category;
        this.categoryId = categoryId;
        this.pageCount = pageCount;
        this.publisher  = publisher;
        this.author.addBook(this );
        this.publisher.addBook(this);
    }
    public int calcPrice( ){
        int sal = this.pageCount * this.publisher.pagePrice; //rub
        return sal;
    }
}

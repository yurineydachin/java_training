package com.example.books;

public class Book {

    public  String name;
    public  int year;
    public int pageCount;
    //public Author author;
    public  int authorId;
    //public  String category;
    public  int categoryId;
    //public  Publisher publisher;
    public  int publisherId;

    public  Book(String name, int year, int pageCount, int authorId, int categoryId, int publisherIdr ){
        this.name = name;
        this.year = year;
        this.pageCount = pageCount;
        this.authorId = authorId;
        this.categoryId = categoryId;
        this.publisherId = publisherIdr;
        this.getAuthor(this).addBook(this );
        this.publisher.addBook(this);
    }
    public int calcPrice( ){
        return this.pageCount * this.publisher.pagePrice; //rub
    }
}

package com.example.books;

public class Book {

    private   String name;
    private   int year;
    private int pageCount;
    private   int authorId;
    private   int categoryId;
    private   int publisherId;

    public  Book(String name, int year, int pageCount, int authorId, int categoryId, int publisherId ){
        this.name = name;
        this.year = year;
        this.pageCount = pageCount;
        this.authorId = authorId;
        this.categoryId = categoryId;
        this.publisherId = publisherId;
        this.getAuthor().addBook(this );
        this.getCategory().addBook(this );
        this.getPublisher().addBook(this);
    }
    public int calcPrice( ){
        return getPageCount() * this.getPublisher().getPagePrice(); //rub
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public int getPageCount(){
        return this.pageCount;
    }
    public Author getAuthor(){

        return Author.getAuthor(this.authorId);
    }
    public Category getCategory(){
        return Category.getCategory(this.categoryId);
    }
    public Publisher getPublisher(){
        return Publisher.getPublisher(this.publisherId);
    }
}

package com.example.books;

import java.util.ArrayList;

public abstract class Publication {
    private int id;
    private   String name;
    private   int year;
    private int pageCount;
    private   int authorId;
    private   int categoryId;
    private   int publisherId;
    private  int parentId;
    public ArrayList<Publication> subpublication = new ArrayList<>();

    public  Publication(int id, String name, int year, int pageCount, int authorId, int categoryId, int publisherId, int parentId){
        this.id = id;
        this.name = name;
        this.year = year;
        this.pageCount = pageCount;
        this.authorId = authorId;
        this.categoryId = categoryId;
        this.publisherId = publisherId;
        this.parentId = parentId;
        if (parentId != 0)
            this.getParent().addSubPublication(this);
        Regestry.getInstance().addPublication(this);
        this.getAuthor().addPublication(this );
        this.getCategory().addPublication(this );
        this.getPublisher().addPublication(this);
    }
    public int getId(){
        return this.id;
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
        return Regestry.getInstance().getAuthor(this.authorId);
    }
    public Category getCategory(){
        return Regestry.getInstance().getCategory(this.categoryId);
    }

    public Publisher getPublisher(){
        return Regestry.getInstance().getPublisher(this.publisherId);
    }
    public Publication getParent(){
        return Regestry.getInstance().getPublication(this.parentId);
    }
    public void addSubPublication(Publication publication){
         this.subpublication.add(publication);
    }
    public int calcPrice( ){
        int k = 0;
        if(this.subpublication.size() == 0) {
            return this.getPageCount() * this.getPublisher().getPagePrice();
        }//rub}
        for(Publication p: this.subpublication){
             k =  k + p.calcPrice() ;
        }
        return k + this.getPageCount() * this.getPublisher().getPagePrice();
    }
    //"Book: Little mermaid, pages: 234, year: 2008, Category: Tales, Author: Pushkin, Publisher: RosBook"
    public String toString(){

        return "Book: " + name + ", pages: " + pageCount + ", year: " + year + ", Category: " +  getCategory() + ", Author: " + getAuthor() + ", Publisher: " + getPublisher();
    }
}

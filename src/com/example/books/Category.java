package com.example.books;

import java.util.ArrayList;

public class Category extends BookContainer {
    ArrayList<Category> subcategory = new ArrayList<>();
    private  int parentId;


    public Category(int id, String name, int parentId){
        super(id,name);
        this.parentId = parentId;
        if(this.getParent() != null){
        this.getParent().addSubCategory(this);}
    }

    public  int getParentId(){
        return this.parentId;
    }
    public  ArrayList<Category> getSubcategory(){
        return this.subcategory;
    }
    public int booksCount(){
       return this.getBooks().size();

    }

    public Category getParent(){
       return Regestry.getInstance().getCategory(this.parentId);
    }
    public void addSubCategory(Category category){
        this.subcategory.add(category);
    }
    public ArrayList<Book> getBooks(){

        ArrayList<Book> allBook = new ArrayList<>();
         for(Book b: super.getBooks()) {
             allBook.add(b);
         }
        for(Category c: this.subcategory){
            for (Book b: c.getBooks()){
                allBook.add(b);
            }
        }
        return allBook;
    }



}

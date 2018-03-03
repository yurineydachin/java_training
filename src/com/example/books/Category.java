package com.example.books;

import java.util.ArrayList;
import java.util.HashMap;

public class Category extends BookContainer {
    private ArrayList<Category> subcategory = new ArrayList<>();
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
//рисует дерево
    public  void getCategary (String s){
        System.out.println(s + this.getName());
        for(Category c1: this.getSubcategory()){
            c1.getCategary( s + "- ");
        }
    }

    public int getMaxLevelCount(){
        int max = 0;
        if (this.subcategory.size()==0){
            return 0;
        }
        for(Category c: this.subcategory){
          if((c.getMaxLevelCount() + 1) > max){
              max =  c.getMaxLevelCount() + 1;
          }
        }
        return max;
    }

}

package com.example.books;

import java.util.ArrayList;

public class Category extends BookContainer {

    private  int parentId;


    public Category(int id, String name, int parentId){
        super(id,name);
        this.parentId = parentId;
    }

    public int getParentId(){
        return this.parentId;
    }

    public int booksCount(){
       return getBooks().size();

    }

}

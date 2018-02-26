package com.example.books;

import java.util.ArrayList;

public class Publisher extends BookContainer {

    private   int pagePrice;

    public Publisher(int id, String name, int pagePrice){
        super(id, name);
        this.pagePrice = pagePrice;
    }

    public int getPagePrice(){
        return this.pagePrice;
    }



}

package com.example.books;

import java.util.ArrayList;

public class Publisher extends PublicationContainer {

    private   int pagePrice;

    public Publisher(int id, String name, int pagePrice){
        super(id, name);
        this.pagePrice = pagePrice;
        Regestry.getInstance().addPublisher(this);
    }

    public int getPagePrice(){
        return this.pagePrice;
    }



}

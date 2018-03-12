package com.example.books;

import java.util.ArrayList;

public abstract class Contract {
    private int id;
    private String name;
    private int pagePrice;
    //private ArrayList<Contract> variantContract = new ArrayList<>();

    public Contract(int id, String name, int pagePrice){
        this.id = id;
        this.name = name;
        this.pagePrice = pagePrice;
        Regestry.getInstance().addContract(this);
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getPagePrice(){
        return this.pagePrice;
    }

    public abstract int getPrice(Publication pub);
}

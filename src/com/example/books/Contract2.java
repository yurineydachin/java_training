package com.example.books;

import java.util.ArrayList;

public class Contract2 extends Contract {
    private int id;
    private String name;
    private ArrayList<Integer> pagePrice;

    public Contract2(int id, String name, ArrayList<Integer> pagePrice){
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
    public ArrayList<Integer> getPagePrice(){
        return this.pagePrice;

    }
    public int getPrice(Publication pub){
        int k = 0;
        int page = 0;
        int price1 = 0;
        int price2 = 0;
        int price3 = 0;
        if(pub.subpublication.size() == 0) {
            page = pub.getPageCount();
            if(page <= 100){
                price1 = price1 + page* this.getPagePrice().get(0);
                return price1;
            }
            if(page > 100 && page <= 300){
                price2 = price2 + (page - 100)* this.getPagePrice().get(1) + 100 * this.getPagePrice().get(0);
                return price2;
            }
            price3 = price3 + (page - 300)* this.getPagePrice().get(2) + 100 * this.getPagePrice().get(0) + 200 * this.getPagePrice().get(1);
            return  price3;
        }//rub}
        for(Publication p: pub.subpublication){
            k =  k + p.calcPrice();
        }
        return k + price1 + price2 + price3;

    }
}

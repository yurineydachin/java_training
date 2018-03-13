package com.example.books;

public class Contract1 extends Contract{

    private int id;
    private String name;
    private int pagePrice;

    public Contract1(int id, String name, int pagePrice){
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
    public  int getPrice(Publication pub){
        int k = 0;
        if(pub.subpublication.size() == 0) {
            return pub.getPageCount() * this.getPagePrice();
        }//rub}
        for(Publication p: pub.subpublication){
            k =  k + p.calcPrice();
        }
        return k + pub.getPageCount() * this.getPagePrice();
    }
}

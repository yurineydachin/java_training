package com.example.books;

public class Contract1 extends Contract{

    public Contract1(int id, String name, int pagePrice) {
        super(id, name, pagePrice);
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

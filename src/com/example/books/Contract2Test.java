package com.example.books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Contract2Test {

    @BeforeEach
    void setUp() {
        Regestry.clear();
    }

    @Test
    void getPriceVariant1() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 2);
        Newspaper b = new Newspaper(1,"Белоснежка", 2001, 100, 1, 11, 1,0,1);

        ArrayList<Integer> pagePrice =  new  ArrayList<>();
        Collections.addAll(pagePrice, 10, 6, 2);
        Contract c = new Contract2(1, "Линейный", pagePrice);


        assertEquals(c.getPrice(b), 1000);
        assertEquals(b.calcPrice(), 1000);
    }
    @org.junit.jupiter.api.Test
    void getPriceVariant3() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 2);
        Book b = new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0,1);
        Book b2 = new Book(2,"Белоснежка", 2001, 70, 1, 11, 1,1,1);
        Book b3 = new Book(3,"Белоснежка", 2001, 50, 1, 11, 1,1,1);
        ArrayList<Integer> pagePrice =  new  ArrayList<>();
        Collections.addAll(pagePrice, 10, 6, 2);
        Contract c = new Contract2(1, "Линейный", pagePrice);


        assertEquals(c.getPrice(b), 2200);
        assertEquals(b.calcPrice(), 2200);
    }
    @org.junit.jupiter.api.Test
    void getPriceVariant4() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 2);
        new Publisher(2, "Семечко", 1);
        Book b = new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0,1);
        Book b2 = new Book(2,"Белоснежка", 2001, 70, 1, 11, 1,1,1);
        Book b3 = new Book(3,"Белоснежка", 2001, 50, 1, 11, 2,1,2);


        ArrayList<Integer> pagePrice =  new  ArrayList<>();
        Collections.addAll(pagePrice, 10, 6, 2);

        ArrayList<Integer> pagePrice2 =  new  ArrayList<>();
        Collections.addAll(pagePrice2, 20, 12, 4);

        Contract c = new Contract2(1, "Линейный", pagePrice);
        Contract c2 = new Contract2(2, "Линейный", pagePrice2);

        assertEquals(c.getPrice(b2), 700);
        assertEquals(b2.calcPrice(), 700);
        assertEquals(c2.getPrice(b3), 1000);
        assertEquals(b3.calcPrice(), 1000);
        assertEquals(c.getPrice(b), 2700);
        assertEquals(b.calcPrice(), 2700);
    }
}
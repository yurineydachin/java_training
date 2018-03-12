package com.example.books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Contract1Test {

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
        Contract c1 = new Contract1(2, "Линейный", 1);
        Contract c = new Contract1(1, "Линейный", 2);


        //assertEquals(getPrice(), 200);
        assertEquals(b.getContract(), c);
    }
    @org.junit.jupiter.api.Test
    void getPriceVariant2() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 2);
        Book b = new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0,1);
        Book b2 = new Book(2,"Белоснежка", 2001, 70, 1, 11, 1,1,1);
        Contract1 c = new Contract1(1, "Линейный", 2);

        assertEquals(c.getPrice(b), 340);
        assertEquals(b.calcPrice(), 340);
    }
    @org.junit.jupiter.api.Test
    void getPriceVariant3() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 2);
        Book b = new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0,1);
        Book b2 = new Book(2,"Белоснежка", 2001, 70, 1, 11, 1,1,1);
        Book b3 = new Book(3,"Белоснежка", 2001, 50, 1, 11, 1,1,1);
        Contract1 c = new Contract1(1, "Линейный", 2);

        assertEquals(c.getPrice(b), 440);
        assertEquals(b.calcPrice(), 440);
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
        Contract1 c = new Contract1(1, "Линейный", 2);
        Contract1 c2 = new Contract1(2, "Линейный", 1);

        assertEquals(c.getPrice(b), 390);
        assertEquals(b.calcPrice(), 390);
    }
}
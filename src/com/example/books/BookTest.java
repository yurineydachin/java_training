package com.example.books;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Regestry.clear();
    }

    @org.junit.jupiter.api.Test
    void getName() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 60);
        Book b = new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0);

        assertEquals(b.getName(), "Белоснежка");
    }

    @org.junit.jupiter.api.Test
    void getParent() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 60);
        Book b = new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0);
        Book b2 = new Book(2,"Белоснежка1", 2001, 70, 1, 11, 1,1);

        assertEquals(b2.getParent(), b);
    }

    @org.junit.jupiter.api.Test
    void calcPrice1book() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 60);
        Book b = new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0);

        assertEquals(b.getPageCount(), 100);
        assertEquals(b.getPublisher().getPagePrice(), 60);
        assertEquals(b.calcPrice(), 6000);
    }

    @org.junit.jupiter.api.Test
    void calcPrice2book() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 60);
        Book b = new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0);
        Book b2 = new Book(2,"Белоснежка", 2001, 70, 1, 11, 1,1);

        assertEquals(b.getPageCount(), 100);
        assertEquals(b.getPublisher().getPagePrice(), 60);
        assertEquals(b.calcPrice(), 10200);
    }
    @org.junit.jupiter.api.Test
    void calcPrice3book() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 60);
        Book b = new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0);
        Book b2 = new Book(2,"Белоснежка", 2001, 100, 1, 11, 1,1);
        Book b3 = new Book(3,"Белоснежка", 2001, 100, 1, 11, 1,1);

        assertEquals(b.getPageCount(), 100);
        assertEquals(b.getPublisher().getPagePrice(), 60);
        assertEquals(b.calcPrice(), 18000);
    }
    @org.junit.jupiter.api.Test
    void calcPrice4book() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 60);
        Book b = new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0);
        Book b2 = new Book(2,"Белоснежка", 2001, 100, 1, 11, 1,1);
        Book b3 = new Book(3,"Белоснежка", 2001, 100, 1, 11, 1,1);
        Book b4 = new Book(4,"Белоснежка", 2001, 100, 1, 11, 1,3);
        Book b5 = new Book(5,"Белоснежка", 2001, 100, 1, 11, 1,3);

        assertEquals(b.getPageCount(), 100);
        assertEquals(b.getPublisher().getPagePrice(), 60);
        assertEquals(b.calcPrice(), 30000);
        assertEquals(b2.calcPrice(), 6000);
    }
    @org.junit.jupiter.api.Test
    void getAuthor() {
        Author a = new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 60);
        Book b = new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0);

        assertEquals(b.getAuthor(), a);

    }

    @org.junit.jupiter.api.Test
    void getCategory() {
        new Author(1, "Пушкин");
        Category c = new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 60);
        Book b = new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0);

        assertEquals(b.getCategory(), c);
    }

    @org.junit.jupiter.api.Test
    void getPublisher() {
        Author a = new Author(1, "Пушкин");
        Category c = new Category( 11,"Сказки зарубежные добрые", 0);
        Publisher p = new Publisher(1, "Семечко", 60);
        Book b = new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0);

        assertEquals(b.getPublisher(), p);
        assertEquals(b.getPublisher().getPublications().size(), 1);
        assertEquals(b.getAuthor().getPublications().size(), 1);
        assertEquals(b.getCategory().getPublications().size(), 1);
    }
}
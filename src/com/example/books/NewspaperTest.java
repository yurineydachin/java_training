package com.example.books;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NewspaperTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Regestry.clear();
    }

    @org.junit.jupiter.api.Test
    void getName() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 60);
        Newspaper b = new Newspaper(1,"Белоснежка", 2001, 100, 1, 11, 1,0,1);

        assertEquals(b.getName(), "Белоснежка");
    }

    @org.junit.jupiter.api.Test
    void getParent() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 60);
        Newspaper b = new Newspaper(6, "Вестник", 2018,10,1,11, 1,0,1);
        Article b2 = new Article(9, "Что произошло на этой недели ", 2018,3,1,11, 1,6,1);

        assertEquals(b2.getParent(), b);
    }


    @org.junit.jupiter.api.Test
    void getAuthor() {
        Regestry r = Regestry.getInstance();
        Author a = new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 60);
        Newspaper b = new Newspaper(1,"Белоснежка", 2001, 100, 1, 11, 1,0,1);

        assertEquals(b.getAuthor(), a);

    }

    @org.junit.jupiter.api.Test
    void getCategory() {
        new Author(1, "Пушкин");
        Category c = new Category( 11,"Сказки зарубежные добрые", 0);
        new Publisher(1, "Семечко", 60);
        Newspaper b = new Newspaper(1,"Белоснежка", 2001, 100, 1, 11, 1,0,1);

        assertEquals(b.getCategory(), c);

    }

    @org.junit.jupiter.api.Test
    void getPublisher() {
        new Author(1, "Пушкин");
        new Category( 11,"Сказки зарубежные добрые", 0);
        Publisher p = new Publisher(1, "Семечко", 60);

        Newspaper b = new Newspaper(1,"Белоснежка", 2001, 100, 1, 11, 1,0,1);

        assertEquals(b.getPublisher(), p);
        assertEquals(b.getPublisher().getPublications().size(), 1);
        assertEquals(b.getAuthor().getPublications().size(), 1);
        assertEquals(b.getCategory().getPublications().size(), 1);
    }
}
package com.example.books;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    public static void main(String[] argv){
        Regestry r = Regestry.getInstance();
        r.addAuthor(new Author(1, "Пушкин"));
        r.addAuthor( new Author(2, "Маршак"));
        r.addAuthor( new Author(3, "Булгаков"));
        r.addAuthor( new Author(4, "Достоевский"));


        r.addCategory(new Category("Сказки", 1));
        r.addCategory(new Category("Роман", 2));
        r.addCategory( new Category("Стихи", 3));
        r.addCategory( new Category("Драма", 4));


        r.addPublisher(  new Publisher(1, "Семечко", 60));
        r.addPublisher( new Publisher(2, "Бубн", 65));



        ArrayList<Book> bookLst = new ArrayList<>();
        bookLst.add(new Book("Белоснежка", 2001, 100, 1, 1, 1));
        bookLst.add(new Book("Чипполино", 1996, 150, 2, 1, 2));
        bookLst.add(new Book("Мастер и Маргарита", 1972, 300, 3, 2, 1));
        bookLst.add(new Book("Стихи Пушкина", 2001, 180 , 1, 3, 1));
        bookLst.add(new Book("Преступление и наказание", 2018,247, 4, 4, 2));



        //System.out.println(authorsMap.get(0));

        print.printYearReport(bookLst);
        print.printCategoryReport( r.categoryMap);
        print.printAuthorReport(bookLst);
        print.printAuthorHaveBookMore2(bookLst);
        print.booksTotalPrice(r.categoryMap.get(1));
        print.booksTotalPrice(r.publishersMap.get(1));
        print.booksTotalPrice(r.authorsMap.get(1));


    }




}

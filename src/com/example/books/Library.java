package com.example.books;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    public static void main(String[] argv){
        Regestry r = Regestry.getInstance();
        r.addAuthor(new Author(0, "Пушкин"));
        r.addAuthor( new Author(1, "Маршак"));
        r.addAuthor( new Author(2, "Булгаков"));
        r.addAuthor( new Author(3, "Достоевский"));


        r.addCategory(new Category("Сказки", 0));
        r.addCategory(new Category("Роман", 1));
        r.addCategory( new Category("Стихи", 2));
        r.addCategory( new Category("Драма", 3));


        r.addPublisher(  new Publisher(0, "Семечко", 60));
        r.addPublisher( new Publisher(1, "Бубн", 65));



        ArrayList<Book> bookLst = new ArrayList<>();
        bookLst.add(new Book("Белоснежка", 2001, 100, 0, 0, 0));
        bookLst.add(new Book("Чипполино", 1996, 150, 1, 0, 1));
        bookLst.add(new Book("Мастер и Маргарита", 1972, 300, 2, 1, 0));
        bookLst.add(new Book("Стихи Пушкина", 2001, 180 , 0, 2, 0));
        bookLst.add(new Book("Преступление и наказание", 2018,247, 3, 3, 1));



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

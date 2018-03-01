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


        r.addCategory(new Category(1, "Сказки", 0));
        r.addCategory(new Category(2, "Роман", 0));
        r.addCategory(new Category(3, "Стихи", 0));
        r.addCategory(new Category(4, "Драма", 0));

        r.addCategory(new Category( 5,"Сказки русские", 1));
        r.addCategory(new Category( 6,"Сказки зарубежные", 1));
        r.addCategory(new Category( 7,"Сказки народные", 1));
        r.addCategory(new Category( 8,"Женский", 2));
        r.addCategory(new Category( 9,"Мужской", 2));
        r.addCategory(new Category( 10,"Классика", 2));
        r.addCategory(new Category( 11,"Сказки зарубежные добрые", 6));
        r.addCategory(new Category( 12,"Сказки зарубежные злые", 11));

        r.addPublisher(  new Publisher(1, "Семечко", 60));
        r.addPublisher( new Publisher(2, "Бубн", 65));



        ArrayList<Book> bookLst = new ArrayList<>();
        bookLst.add(new Book("Белоснежка", 2001, 100, 1, 11, 1));
        bookLst.add(new Book("Чипполино", 1996, 150, 2, 12, 2));
        bookLst.add(new Book("Мастер и Маргарита", 1972, 300, 3, 10, 1));
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

        //print p = new print();
       //p.treeCategory(r.categoryMap);
        print.treeCategory(r.categoryMap);
    }




}

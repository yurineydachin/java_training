package com.example.books;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    public static HashMap<Integer, Author> authorsMap ;
    public  static HashMap<Integer, Category> categoryMap;
    public  static HashMap<Integer, Publisher> publishersMap;
    public static void main(String[] argv){

        HashMap<Integer, Author> authorsMap = new HashMap<>();
        authorsMap.put(0, new Author(0, "Пушкин"));
        authorsMap.put(1, new Author(1, "Маршак"));
        authorsMap.put(2, new Author(2, "Булгаков"));
        authorsMap.put(3, new Author(3, "Достоевский"));

        HashMap<Integer, Category> categoryMap = new HashMap<>();
        categoryMap.put(0, new Category("Сказки", 0));
        categoryMap.put(1, new Category("Роман", 1));
        categoryMap.put(2, new Category("Стихи", 2));
        categoryMap.put(3, new Category("Драма", 3));

        HashMap<Integer, Publisher> publishersMap = new HashMap<>();
        publishersMap.put(0, new Publisher(0, "Семечко", 60));
        publishersMap.put(1, new Publisher(1, "Бубн", 65));



        ArrayList<Book> bookLst = new ArrayList<Book>();
        bookLst.add(new Book("Белоснежка", 2001, 100, 0, 0, 0));
        bookLst.add(new Book("Чипполино", 1996, 150, 1, 0, 1));
        bookLst.add(new Book("Мастер и Маргарита", 1972, 300, 2, 1, 0));
        bookLst.add(new Book("Стихи Пушкина", 2001, 180 , 0, 2, 0));
        bookLst.add(new Book("Преступление и наказание", 2018,247, 3, 3, 1));





        print.printYearReport(bookLst);
        print.printCategoryReport( categoryMap);
        print.printAuthorReport(bookLst);
        print.printAuthorHaveBookMore2(bookLst);
        print.booksTotalPrice(categoryMap.get(0));
        print.booksTotalPrice(publishersMap.get(0));
        print.booksTotalPrice(categoryMap.get(0));

    }




}

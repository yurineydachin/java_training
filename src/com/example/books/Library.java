package com.example.books;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    public static void main(String[] argv){
        Author a = new Author(1, "Пушкин");
        ArrayList<Book> bookLst = new ArrayList<Book>();
        bookLst.add(new Book("Белоснежка", 2001, a, "Сказки", 1, 100, "Семечко"));
        bookLst.add(new Book("Чипполино", 1996, new Author(2, "Маршак"), "Сказки", 1, 150, "Бубн"));
        bookLst.add(new Book("Мастер и Маргарита", 1972, new Author(3, "Булгаков"), "Роман", 2, 300,"Семечко"));
        bookLst.add(new Book("Стихи Пушкина", 2001, a , "Стихи", 3, 180, "Семечко"));
        bookLst.add(new Book("Преступление и наказание", 2018, new Author(4, "Достоевский"), "Драма", 4, 247, "Бубн"));

        ArrayList<Category> categoryList = new ArrayList<Category>();
        categoryList.add(new Category("Сказки", 1));
        categoryList.add(new Category("Роман", 2));
        categoryList.add(new Category("Стихи", 3));
        categoryList.add(new Category("Драма", 4));



        Category.setBooks( categoryList, bookLst );
        print.printYearReport(bookLst);
        print.printCategoryReport( categoryList,  bookLst);
        print.printAuthorReport(bookLst);
        print.printAuthorHaveBookMore2(bookLst);
        print.booksTotalPrice(categoryList.get(0));
        print.booksTotalPrice(pub.get(0));
        print.booksTotalPrice(categoryList.get(0));

    }




}

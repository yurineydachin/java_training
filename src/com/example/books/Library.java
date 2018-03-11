package com.example.books;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    public static void main(String[] argv){
        ArrayList<Author> a = new ArrayList<>();
        a.add(new Author(1, "Пушкин"));
        a.add( new Author(2, "Маршак"));
        a.add( new Author(3, "Булгаков"));
        a.add( new Author(4, "Достоевский"));
        a.add( new Author(5, "Иванов"));
        a.add( new Author(6, "Конопатый"));

        ArrayList<Category> c = new ArrayList<>();
        c.add(new Category(1, "Сказки", 0));
        c.add(new Category(2, "Роман", 0));
        c.add(new Category(3, "Стихи", 0));
        c.add(new Category(4, "Драма", 0));

        c.add(new Category( 5,"Сказки русские", 1));
        c.add(new Category( 6,"Сказки зарубежные", 1));
        c.add(new Category( 7,"Сказки народные", 1));
        c.add(new Category( 8,"Женский", 2));
        c.add(new Category( 9,"Мужской", 2));
        c.add(new Category( 10,"Классика", 2));
        c.add(new Category( 11,"Сказки зарубежные добрые", 6));
        c.add(new Category( 12,"Сказки зарубежные злые", 11));
        c.add(new Category( 13,"Новости", 0));

        ArrayList<Publisher> p = new ArrayList<>();
        p.add(  new Publisher(1, "Семечко", 60));
        p.add( new Publisher(2, "Бубн", 65));
        p.add( new Publisher(3, "Городская газете", 35));



        ArrayList<Book> bookLst = new ArrayList<>();
        bookLst.add(new Book(1,"Белоснежка", 2001, 100, 1, 11, 1,0,1));
        bookLst.add(new Book(2,"Чипполино", 1996, 150, 2, 12, 2,0,1));
        bookLst.add(new Book(3,"Мастер и Маргарита", 1972, 300, 3, 10, 1,0,2));
        bookLst.add(new Book(4,"Стихи Пушкина", 2001, 180 , 1, 3, 1,0,1));
        bookLst.add(new Book(5,"Преступление и наказание", 2018,247, 4, 4, 2,0,2));

        ArrayList<Newspaper> NewspaperList = new ArrayList<>();
        NewspaperList.add(new Newspaper(6, "Вестник", 2018,10,5,13, 3,0,1));
        NewspaperList.add(new Newspaper(7, "Мурзилка",2017, 17, 6, 5, 3,0,1));
        NewspaperList.add(new Newspaper(8, "Около дома", 2018,24,5,13, 3, 0,1));

        ArrayList<Article> ArticleList = new ArrayList<>();
        ArticleList.add(new Article(9, "Что произошло на этой недели ", 2018,3,5,13, 3,6,1));
        ArticleList.add(new Article(10, "Герои Лунтика расскаывают новую историю",2017, 2, 6, 5, 3,7,1));
        ArticleList.add(new Article(11, "Проблемы жкх", 2018,1,5,13, 3, 8,1));
        ArticleList.add(new Article(12, "Мировые новости ", 2018,1,5,13, 3,6,1));


        //System.out.println(authorsMap.get(0));

        print.printYearReport(bookLst);
        print.printCategoryReport(c);
        print.printAuthorReport(bookLst);
        print.printAuthorHaveBookMore2(bookLst);
        print.booksTotalPrice(c.get(0));
        print.booksTotalPrice(p.get(0));
        print.booksTotalPrice(a.get(0));

        //print p = new print();
       //p.treeCategory(r.categoryMap);
        print.treeCategory(c);
        System.out.println("maxLevelCount " + print.maxLevelCount(c));
        print.pathForBook(bookLst.get(1));
        print.RootCategoryForCurrent(c.get(6));
        print.treeCategoryForCurrent(bookLst.get(0));


    }




}

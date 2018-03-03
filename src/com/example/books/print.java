package com.example.books;

import java.util.ArrayList;
import java.util.HashMap;

public class print {
    static void printYearReport(ArrayList<Book> bookList){
        // int k = 1;
        HashMap<Integer, Integer> year = new HashMap<>();
        for (Book b: bookList){
            if (year.containsKey(b.getYear())) {
                year.put(b.getYear(), year.get(b.getYear())+ 1 );
            }
            else {
                year.put(b.getYear(), 1);
            }
        }
        for(Integer key: year.keySet()){
            System.out.println("Книги " + key + ": " + year.get(key));
        }
        System.out.println("  ");
    }


    static void printCategoryReport(HashMap<Integer, Category> category){
            for (Category c: category.values()){
                System.out.println(c + ": " + c.booksCount());  // .getName() убрали для применения метода тустринг
             }
        System.out.println("  ");
    }

    // group by author
    static HashMap<String, Integer> printAuthorReport(ArrayList<Book> bookList){

        HashMap<String, Integer> authors = new HashMap<>();
        for (Book b: bookList){
            if (authors.containsKey(b.getAuthor().getName())) {
                authors.put(b.getAuthor().getName(), authors.get(b.getAuthor().getName())+ 1 );
            }
            else {
                authors.put(b.getAuthor().getName(), 1);
            }
        }
        for(String key: authors.keySet()){
            System.out.println( key + ": " + authors.get(key));
        }
        System.out.println("  ");
        return authors;

    }

    // groub by author and year and show only if author has more then 2 books
    static void printAuthorHaveBookMore2(ArrayList<Book> bookList){
        HashMap<String, Integer> authors = new HashMap<>();
        for (Book b: bookList){
            if (authors.containsKey(b.getAuthor().getName() +": " + b.getYear())) {
                authors.put(b.getAuthor().getName() +": " + b.getYear(), authors.get(b.getAuthor().getName() +": " + b.getYear())+ 1 );
            }
            else {
                authors.put(b.getAuthor().getName() +": " + b.getYear(), 1);
            }
        }
        for(String key: authors.keySet()){
            if(authors.get(key) > 1) {
                System.out.println(key + ": " + authors.get(key));
            }
        }
        //return authors;
        System.out.println("  ");
    }
    static public int booksTotalPrice(BookContainer obj){
         int booksTotalPrice = 0;

        for( Book book: obj.getBooks()){
            booksTotalPrice = booksTotalPrice + book.calcPrice();
        }
        System.out.println("Стоимость всех книг : "  + booksTotalPrice + " для " +obj);
        return booksTotalPrice;
    }

    //рисуем дерево категорий
    public static void treeCategory(HashMap<Integer, Category> category){
        for (Category c: category.values()){
                if (c.getParentId() == 0){
                    c.getCategary( "- ");
                }
        }
     }
     //макс. количество уровней категории
    public static int maxLevelCount(HashMap<Integer, Category> category) {

        HashMap<Category, Integer> mapRootCategary = new HashMap<>();
        for (Category c : category.values()) {
            if (c.getParentId() == 0) {
                mapRootCategary.put(c, max(c.getChildrenLevelCount()));
            }
        }
        return max(mapRootCategary);
    }


    public static int max(HashMap<Category, Integer> map){
        if (map.size()==0) {
            return 0;
        }
        int max =0;
       // max =  map.values().get(0);
        for(int level: map.values()) {
            if (level > max) {
                max = level;
            }
        }
        return max;
    }
}

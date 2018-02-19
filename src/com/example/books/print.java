package com.example.books;

import java.util.ArrayList;
import java.util.HashMap;

public class print {
    static void printYearReport(ArrayList<Book> bookList){
        // int k = 1;
        HashMap<Integer, Integer> year = new HashMap<Integer, Integer>();
        for (Book b: bookList){
            if (year.containsKey(b.year) == true) {
                year.put(b.year, year.get(b.year)+ 1 );
            }
            else {
                year.put(b.year, 1);
            }
        }
        for(Integer key: year.keySet()){
            System.out.println( key + ": " + year.get(key));
        }
        System.out.println("  ");
    }


    static void printCategoryReport(ArrayList<Category> cat, ArrayList<Book> bookList){
            for (Category c: cat){
                System.out.println(c.name+ ": " + c.booksCount());  // use category.booksCount() new method
             }
        System.out.println("  ");
    }

    // group by author
    static HashMap<String, Integer> printAuthorReport(ArrayList<Book> bookList){

        HashMap<String, Integer> authors = new HashMap<String, Integer>();
        for (Book b: bookList){
            if (authors.containsKey(b.author.name) == true) {
                authors.put(b.author.name, authors.get(b.author.name)+ 1 );
            }
            else {
                authors.put(b.author.name, 1);
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
        HashMap<String, Integer> authors = new HashMap<String, Integer>();
        for (Book b: bookList){
            if (authors.containsKey(b.author.name +": " + b.year) == true) {
                authors.put(b.author.name +": " + b.year, authors.get(b.author.name +": " + b.year)+ 1 );
            }
            else {
                authors.put(b.author.name +": " + b.year, 1);
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
            int priceForBook = book.calcPrice();

            booksTotalPrice = booksTotalPrice + priceForBook;

        }
        System.out.println("Зар.плата за все кники автора: "  + " " + booksTotalPrice);
        return booksTotalPrice;
    }
}

package com.example.books;

public class Article extends Publication{

    public Article(int id, String name,  int year, int pageCount, int authorId, int categoryId, int publisherId, int parentId, int contractId ){

        super(id, name, year, pageCount, authorId, categoryId, publisherId, parentId, contractId);

    }

}

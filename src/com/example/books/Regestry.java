package com.example.books;

import java.util.HashMap;

public class Regestry {
    public  HashMap<Integer, Author> authorsMap  = new HashMap<>();
    public   HashMap<Integer, Category> categoryMap = new HashMap<>();
    public   HashMap<Integer, Publisher> publishersMap = new HashMap<>();

    private static Regestry ourInstance = new Regestry();

    public static Regestry getInstance() {
        return Regestry.ourInstance;
    }

    private Regestry() {
    }
    public  Author getAuthor(int authorId){
        return this.authorsMap.get(authorId);
    }
    public  void addAuthor( Author author){
        authorsMap.put(author.getId(), author);

    }
    public  Category getCategory(int categoryId){
        return categoryMap.get(categoryId);
    }
    public  void addCategory( Category category) {
        categoryMap.put(category.getId(), category);

    }

    public  Publisher getPublisher(int publisherId){
        return publishersMap.get(publisherId);
    }
    public  void addPublisher( Publisher publisher) {
        publishersMap.put(publisher.getId(), publisher);

    }

}

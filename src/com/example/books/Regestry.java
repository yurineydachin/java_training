package com.example.books;

import java.util.HashMap;

public class Regestry {
    private   HashMap<Integer, Author> authorsMap  = new HashMap<>();
    private    HashMap<Integer, Category> categoryMap = new HashMap<>();
    private    HashMap<Integer, Publisher> publishersMap = new HashMap<>();
    private    HashMap<Integer, Publication> publicationMap = new HashMap<>();
    private    HashMap<Integer, Contract> contractsMap = new HashMap<>();

    private static Regestry ourInstance;

    public static Regestry getInstance() {
        if (ourInstance == null) {
            ourInstance = new Regestry();
        }
        return Regestry.ourInstance;
    }

    public static void clear() {
        ourInstance = null;
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
    public  Publication getPublication(int publicationId){
        return publicationMap.get(publicationId);
    }
    public  void addPublication( Publication publication) {
        publicationMap.put(publication.getId(), publication);

    }
    public  Contract getContract(int contractId){
        return contractsMap.get(contractId);
    }
    public  void addContract( Contract contract) {
        contractsMap.put(contract.getId(), contract);

    }

}

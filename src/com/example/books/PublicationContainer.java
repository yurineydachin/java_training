package com.example.books;

import java.util.ArrayList;

abstract public class PublicationContainer {
    private int id;
    private String name;
    private ArrayList<Publication> publications = new  ArrayList<>();

    public PublicationContainer(int id, String name){
        this.id = id;
        this.name = name;

    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void addPublication(Publication p){
        this.publications.add(p);
    }
    public ArrayList<Publication> getPublications(){
        return this.publications;
    }
    public String toString(){
        if (name != null && id != 0) {
            return this.getClass().getName() + id + ": " + name;
        }
        return this.getClass().getName() +  " is empty";
    }
}

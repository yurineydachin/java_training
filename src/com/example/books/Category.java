package com.example.books;

import java.util.ArrayList;

public class Category extends PublicationContainer {
    private ArrayList<Category> subcategory = new ArrayList<>();
    private  int parentId;


    public Category(int id, String name, int parentId){
        super(id,name);
        this.parentId = parentId;
        if(this.getParent() != null){
        this.getParent().addSubCategory(this);}
        Regestry.getInstance().addCategory(this);
    }

    public  int getParentId(){
        return this.parentId;
    }
    public  ArrayList<Category> getSubcategory(){
        return this.subcategory;
    }
    public int booksCount(){
       return this.getPublications().size();

    }

    public Category getParent(){
       return Regestry.getInstance().getCategory(this.parentId);
    }
    public void addSubCategory(Category category){
        this.subcategory.add(category);
    }
    public ArrayList<Publication> getPublications(){

        ArrayList<Publication> allPub = new ArrayList<>();
         for(Publication p: super.getPublications()) {
             allPub.add(p);
         }
        for(Category c: this.subcategory){
            for (Publication p: c.getPublications()){
                allPub.add(p);
            }
        }
        return allPub;
    }
//рисует дерево
    public  void printTreeCategory (String s){
        System.out.println(s + this.getName());
        for(Category c1: this.getSubcategory()){
            c1.printTreeCategory( s + "- ");
        }
    }

    public int getMaxLevelCount(){
        int max = 0;
        if (this.subcategory.size()==0){
            return 0;
        }
        for(Category c: this.subcategory){
            int maxLev = c.getMaxLevelCount();
            if((maxLev + 1) > max){
                max =  maxLev + 1;
            }
        }
        return max;
    }
    public String getPathForCategory(){

        if (this.getParent() == null){
            return this.getName();
        }
        return this.getParent().getPathForCategory() + " / " + this.getName();
    }
    public Category getRoot(){
        if (this.getParent() == null){
            return this;
        }
        return this.getParent().getRoot();
    }

}

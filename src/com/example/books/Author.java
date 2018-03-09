package com.example.books;

import java.util.ArrayList;

public class Author extends PublicationContainer{


    public Author(int id, String name){
        super(id, name);
        Regestry.getInstance().addAuthor(this);
    }

}
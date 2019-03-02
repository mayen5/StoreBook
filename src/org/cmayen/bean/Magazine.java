package org.cmayen.bean;

import java.util.ArrayList;
import java.util.Date;

public class Magazine extends Publication{
    private int id;

    public Magazine() {
    }

    public Magazine(String title, Date editionDate, String editorial) {
        super(title, editionDate, editorial);
    }
    

    public int getId() {
        return id;
    }

    
    @Override
    public String toString(){
        return "Book: " + this.getTitle()+ " - " + this.getEditorial();
    }

    public static ArrayList<Magazine> makeMagazineList(){
        return null;
    }
}

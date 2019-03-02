package org.cmayen.bean;

import java.util.ArrayList;
import java.util.Date;
import org.cmayen.interfaces.IVisualizable;

public class Book extends Publication implements IVisualizable{
    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book() {
    }

    public Book(String title, Date editionDate, String editorial, String[] authors) {
        super(title, editionDate, editorial);
        super.setAuthors(authors);
    }
    
    public int getId() {
        return id;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }
    
    @Override
    public String toString(){
        return "Book: " + this.getIsbn() + " - " + this.getTitle();
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        this.timeReaded = (int) (dateF.getTime() - dateI.getTime());
    }
    
    public static ArrayList<Book> makeBookList(){
        return null;
    }
}

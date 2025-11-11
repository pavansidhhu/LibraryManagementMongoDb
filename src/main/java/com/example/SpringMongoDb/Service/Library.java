package com.example.SpringMongoDb.Service;


import com.example.SpringMongoDb.Repository.LibraryRepo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;
import java.util.Date;


@Document(collection = "Library")
public class Library {

    private int id;
    private String name;
    private String bookname;
    private String author;
    private Date doi;
    private Date dor;

    public Library(int id, String name, String bookname, String author, Date doi, Date dor) {
        this.id = id;
        this.name = name;
        this.bookname = bookname;
        this.author = author;
        this.doi = doi;
        this.dor = dor;
    }

    public Library() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDoi() {
        return doi;
    }

    public void setDoi(Date doi) {
        this.doi = doi;
    }

    public Date getDor() {
        return dor;
    }

    public void setDor(Date dor) {
        this.dor = dor;
    }


}

package com.qa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String author;

    public Book() {
    }

    public Book(Long id, String name, String author) {
        this.Id=id;
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

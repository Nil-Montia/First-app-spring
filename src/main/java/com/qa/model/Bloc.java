package com.qa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String subtitle;
    private Long user_iduser;

    public Bloc() {
    }

    public Bloc(String title, String subtitle, Long user_iduser) {
        this.title = title;
        this.subtitle = subtitle;
        this.user_iduser = user_iduser;
    }

    public Bloc(String title, Long user_iduser) {
        this.title = title;
        this.user_iduser = user_iduser;
    }

    public Bloc(Long user_iduser) {
        this.user_iduser = user_iduser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Long getUser_iduser() {
        return user_iduser;
    }

    public void setUser_iduser(Long user_iduser) {
        this.user_iduser = user_iduser;
    }
}

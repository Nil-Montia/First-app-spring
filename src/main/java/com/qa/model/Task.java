package com.qa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int bloc_idbloc;
    private int user_iduser;
    private String description;
    private Date due_date;

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    private int Status;

    public Task(Long id, int bloc_idbloc, int user_iduser, String description, Date due_date) {
        this.id = id;
        this.bloc_idbloc = bloc_idbloc;
        this.user_iduser = user_iduser;
        this.description = description;
        this.due_date = due_date;
    }

    public Task(Long id, int bloc_idbloc, int user_iduser, String description, Date due_date, int status) {
        this.bloc_idbloc = bloc_idbloc;
        this.user_iduser = user_iduser;
        this.description = description;
        this.due_date = due_date;
        Status = status;
    }

    public Task(Long id, int bloc_idbloc, int user_iduser) {
        this.id = id;
        this.bloc_idbloc = bloc_idbloc;
        this.user_iduser = user_iduser;
    }

    public Task(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBloc_idbloc() {
        return bloc_idbloc;
    }

    public void setBloc_idbloc(int bloc_idbloc) {
        this.bloc_idbloc = bloc_idbloc;
    }

    public int getUser_iduser() {
        return user_iduser;
    }

    public void setUser_iduser(int user_iduser) {
        this.user_iduser = user_iduser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }


}

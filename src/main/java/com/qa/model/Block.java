package com.qa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long blockid;
    private Long userid;
    private String title;

    public Long getBlockid() {
        return blockid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Block() {
    }

    public void setBlockid(Long blockid) {
        this.blockid = blockid;
    }

    public Block(Long userid) {
        this.userid = userid;
    }
}

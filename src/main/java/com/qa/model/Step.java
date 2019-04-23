package com.qa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String status;
    private Long task_idtask;

    public Step(String name, String status, Long task_idtask) {
        this.name = name;
        this.status = status;
        this.task_idtask = task_idtask;
    }

    public Step() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTask_idtask() {
        return task_idtask;
    }

    public void setTask_idtask(Long task_idtask) {
        this.task_idtask = task_idtask;
    }
}

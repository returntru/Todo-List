package com.task.todolist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class TodoItem {

    private Long id;
    @NotBlank
    private String title;
    private boolean status;

    public TodoItem() {
    }

    public TodoItem(Long id, String title, boolean status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

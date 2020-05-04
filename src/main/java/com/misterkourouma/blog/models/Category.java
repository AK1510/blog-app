package com.misterkourouma.blog.models;

public class Category {

    private Long id;
    private String label;

    public Category() {
    }

    public Category(String label) {
        this.label = label;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

package com.misterkourouma.blog.models;

import java.time.LocalDate;

public class Person {

    private Long id;
    private String username;
    private String password;
    private String age;
    private LocalDate dateOfBirth;

    public Person() {
    }

    public Person(String username, String password, String age, LocalDate dateOfBirth) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

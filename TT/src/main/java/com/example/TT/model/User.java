package com.example.TT.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users")
public class User extends Ent{

    @Column(unique = true, nullable = false, name = "username")
    private String username;

    @Column(nullable = false, name = "password")
    private String password;

    @Column(name = "photo_link")
    private String photoLink;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "second_name")
    private String secondName;

    public User(String n, String p, String name, String secondName, String photoLink){
        this.username = n;
        this.password = p;
        this.photoLink = photoLink;
        this.name = name;
        this.secondName = secondName;
        this.createdAt = new Date();
    }

    public User() {

    }

    public boolean auth(String word){
        return this.password.equals(word);
    }
}

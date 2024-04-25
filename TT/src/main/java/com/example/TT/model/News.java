package com.example.TT.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "news")
public class News extends Ent {

    @Column(name = "content")
    private String content;
}

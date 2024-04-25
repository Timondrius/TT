package com.example.TT.service;

import com.example.TT.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class NewsService {
    private Date date;

    public String getNews(){
        return "Timur is a nice Java-Developer";
    }
}

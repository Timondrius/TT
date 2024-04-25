package com.example.TT.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orders")
public class Order extends Ent{

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "delivery_address")
    private String deliveryAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    public Order(String it, int q, String ad, String phn) {
        this.itemName = it;
        this.quantity = q;
        this. deliveryAddress = ad;
        this.phoneNumber = phn;
        this.createdAt = new Date();
    }
}

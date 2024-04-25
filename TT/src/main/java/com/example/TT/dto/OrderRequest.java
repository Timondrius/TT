package com.example.TT.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class OrderRequest {

    private Long id;

    private String itemName;
    public String getItemName(){return this.itemName;}
    private int quantity;
    public int getQuantity(){return this.quantity;}
    private String deliveryAddress;
    public String getDeliveryAddress(){return this.deliveryAddress;}
    private String phoneNumber;
    public String getPhoneNumber(){return this.phoneNumber;}
}

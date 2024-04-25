package com.example.TT.service;

import com.example.TT.dto.OrderRequest;
import com.example.TT.model.Order;
import com.example.TT.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public String submitOrder(OrderRequest request) {
        Order order = new Order(request.getItemName(), request.getQuantity(), request.getDeliveryAddress(), request.getPhoneNumber());
        orderRepository.save(order);
        return "Order submitted";
    }
}


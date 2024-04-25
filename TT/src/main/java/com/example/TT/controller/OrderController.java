package com.example.TT.controller;

import com.example.TT.dto.OrderRequest;
import com.example.TT.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    public String submitOrder(@RequestBody OrderRequest request) {
        return orderService.submitOrder(request);
    }
}

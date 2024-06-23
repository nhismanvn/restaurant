package com.example.TastyKing.controller;

import com.example.TastyKing.entity.OrderHistory;
import com.example.TastyKing.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/admin/order-history")
public class OrderHistoryController {
    @Autowired
    private OrderHistoryService orderHistoryService;

    @GetMapping("/user/{userId}")
    public List<OrderHistory> getOrderHistoryByUserId(@PathVariable Long userId) {
        return orderHistoryService.findByUserId(userId);
    }
}

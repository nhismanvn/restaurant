package com.example.TastyKing.service;

import com.example.TastyKing.entity.OrderHistory;
import com.example.TastyKing.repository.OrderHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OrderHistoryService {
    @Autowired
    private OrderHistoryRepository orderHistryRepository;

    public List<OrderHistory> findByUserId(Long userId) {
        return OrderHistoryRepository.findByUserId(userId);
    }
}

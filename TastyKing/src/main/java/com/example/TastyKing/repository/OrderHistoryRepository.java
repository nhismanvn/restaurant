package com.example.TastyKing.repository;

import com.example.TastyKing.entity.OrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


    public interface OrderHistoryRepository extends JpaRepository<OrderHistory, Long> {
        static List<OrderHistory> findByUserId(Long userId) {
            return null;
        }
    }


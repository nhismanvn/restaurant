package com.example.TastyKing.repository;

import com.example.TastyKing.entity.OrderHistory;
import com.example.TastyKing.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
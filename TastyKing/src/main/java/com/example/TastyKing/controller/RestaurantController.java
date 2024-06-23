package com.example.TastyKing.controller;

import com.example.TastyKing.entity.Restaurant;
import com.example.TastyKing.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/admin/restaurants")
public class RestaurantController {
        @Autowired
        private RestaurantService restaurantService;

        @GetMapping
        public List<Restaurant> getAllRestaurants() {
            return restaurantService.findAll();
        }

        @GetMapping("/{id}")
        public Restaurant getRestaurantById(@PathVariable Long id) {
            return restaurantService.findById(id);
        }

        @PostMapping
        public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
            return restaurantService.save(restaurant);
        }

        @PutMapping("/{id}")
        public Restaurant updateRestaurant(@PathVariable Long id, @RequestBody Restaurant restaurant) {
            restaurant.setId(id);
            return restaurantService.save(restaurant);
        }

        @DeleteMapping("/{id}")
        public void deleteRestaurant(@PathVariable Long id) {
            restaurantService.deleteById(id);
        }
    }




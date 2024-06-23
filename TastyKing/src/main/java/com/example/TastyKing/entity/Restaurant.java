package com.example.TastyKing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Restaurant {
 @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String address;
private String imageUrl;

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public String getImageUrl() {
  return imageUrl;
 }

 public void setImageUrl(String imageUrl) {
  this.imageUrl = imageUrl;
 }

 public String getPromotion() {
  return promotion;
 }

 public void setPromotion(String promotion) {
  this.promotion = promotion;
 }

 private String promotion;


}

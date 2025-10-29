package com.nomadicjazz.smart_inventory_trackerdemo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private String category;

    @Positive
    private int quantity;

    public Product() {

    }

    public Product(String name, String category, int quantity) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return getCategory();
    }

    public void setCategory(String category){
        this.category = category;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name=" + name + '\'' +
                ", category=" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }



}

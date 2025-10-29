package com.nomadicjazz.smart_inventory_trackerdemo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 2, max = 100)
    private String name;

    @NotBlank(message = "Category cannot be empty")
    @Size(min = 2, max = 50)
    private String category;

    @NotNull(message = "Quantity is required")
    @Positive(message = "Quantity must be greater than zero")
    private int quantity;

    private String description;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be greater than zero")
    private double price;

    public Product() {

    }

    public Product(String name, String category,String description, int quantity, double price) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.quantity = quantity;
        this.price = price;


    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

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

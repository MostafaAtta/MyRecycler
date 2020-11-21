package com.atta.myapplication;

import java.io.Serializable;

public class Product implements Serializable {

    private int id, shopId, stock;

    private double price;

    private String name, description, brand, amount, image, category;

    boolean inStock;

    public Product(int id, int shopId, int stock, double price, String name,
                   String description, String brand, String amount, String image,
                   String category, boolean inStock) {
        this.id = id;
        this.shopId = shopId;
        this.stock = stock;
        this.price = price;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.amount = amount;
        this.image = image;
        this.category = category;
        this.inStock = inStock;
    }

    public int getId() {
        return id;
    }

    public int getShopId() {
        return shopId;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public String getAmount() {
        return amount;
    }

    public String getImage() {
        return image;
    }

    public String getCategory() {
        return category;
    }

    public boolean isInStock() {
        return inStock;
    }
}

package com.atta.myapplication;

public class Product {

    private int price;
    private String title, image;

    public Product(String title, String image, int price) {
        this.image = image;
        this.price = price;
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}

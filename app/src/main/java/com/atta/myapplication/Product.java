package com.atta.myapplication;

public class Product {

    private int price, image;
    private String title;

    public Product(String title, int image, int price ) {
        this.price = price;
        this.image = image;
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}

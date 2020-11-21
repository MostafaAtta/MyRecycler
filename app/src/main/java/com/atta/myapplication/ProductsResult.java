package com.atta.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ProductsResult {

    boolean error;

    @SerializedName("products")
    private ArrayList<Product> products;

    public ProductsResult() {
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public boolean isError() {
        return error;
    }
}

package com.atta.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        if (getIntent().getSerializableExtra("product") == null) {

            Product product = (Product) getIntent().getSerializableExtra("product");
            Toast.makeText(this, product.getName(), Toast.LENGTH_SHORT).show();
        }

    }
}
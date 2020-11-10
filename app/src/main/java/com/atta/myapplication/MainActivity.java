package com.atta.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        ArrayList<Product> arrayList = new ArrayList<>();

        Product product1 = new Product("TV", R.drawable.ic_baseline_tv_24,2000);

        arrayList.add(product1);
        arrayList.add(new Product("Radio", R.drawable.ic_baseline_radio_24, 500));
        arrayList.add(new Product("Printer", R.drawable.ic_baseline_local_printshop_24, 1000));


        MyAdapter adapter = new MyAdapter(this, arrayList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        recyclerView.setAdapter(adapter);

    }
    }
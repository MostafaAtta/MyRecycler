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

        arrayList.add(new Product("TV",
                "https://www.elarabygroup.com/media/catalog/product/cache/1/thumbnail/1000x/17f82f742ffe127f42dca9de82fb58b1/t/o/toshiba-32-inch-led-tv-hd-built-in-receiver-2-hdmi-2-usb-inputs-32l3965ea-front-zoom.jpg",
                2000));
        /*arrayList.add(new Product("Radio", R.drawable.ic_baseline_radio_24, 500));
        arrayList.add(new Product("Printer", R.drawable.ic_baseline_local_printshop_24, 1000));

*/
        MyAdapter adapter = new MyAdapter(this, arrayList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        recyclerView.setAdapter(adapter);

    }
    }
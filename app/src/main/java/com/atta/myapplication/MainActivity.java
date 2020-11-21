package com.atta.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        getProducts();


    }

    private void showRecycler(ArrayList<Product> arrayList) {
        MyAdapter adapter = new MyAdapter(this, arrayList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        recyclerView.setAdapter(adapter);
    }

    public void getProducts(){

        Call<ProductsResult> call = APIClient.getInstance().getApi().getProducts("super_market", 2);

        call.enqueue(new Callback<ProductsResult>() {
            @Override
            public void onResponse(Call<ProductsResult> call, Response<ProductsResult> response) {
                if (response.body() != null){
                    if (!response.body().isError()){
                        ArrayList<Product> products = response.body().getProducts();

                        showRecycler(products);
                    }
                }
            }

            @Override
            public void onFailure(Call<ProductsResult> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

}
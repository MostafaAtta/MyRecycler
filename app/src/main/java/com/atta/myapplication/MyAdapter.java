package com.atta.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    ArrayList<Product> data;
    Context context;

    public MyAdapter(Context context, ArrayList<Product> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View viewItem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);

        return new MyHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        Product product = data.get(position);

        holder.titleTextView.setText(product.getName());

        holder.priceTextView.setText(String.valueOf(product.getPrice()));

        String imageUrl = "http://52.15.188.41/find_me/images/" + product.getImage();
        Picasso.get()
                .load(imageUrl)
                .resize(50, 50)
                .centerCrop()
                .into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ProductDetailsActivity.class);
                intent.putExtra("product name", product.getName());
                intent.putExtra("product", product);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        TextView titleTextView, priceTextView;

        ImageView imageView;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.title_tv);
            priceTextView = itemView.findViewById(R.id.price_tv);

            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}

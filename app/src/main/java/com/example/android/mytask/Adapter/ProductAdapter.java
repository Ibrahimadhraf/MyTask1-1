package com.example.android.mytask.Adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.android.mytask.Model.Photo_url;
import com.example.android.mytask.Model.Product;
import com.example.android.mytask.Model.ProductsRate;
import com.example.android.mytask.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.productViewHolder> {
    public ProductAdapter() {
    }

    Context context;
    List<ProductsRate>productList;
    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.productview,parent,false);
        return new productViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productViewHolder holder, int position) {
        String name=productList.get(position).product.name;
        holder.titleTextView.setText(name);
        String price=productList.get(position).price;
        holder.priceTextView.setText(price);
        String amout=productList.get(position).amount;
        holder.amountTextView.setText(amout);
         int count=productList.get(position).orderdetailsList.get(position).count;
         holder.countTextView.setText(String.valueOf(count));
       String url_image=productList.get(position).product.photo_urlList.get(position).image_url;
        Uri uri=Uri.parse(url_image);
        Picasso.get().load(uri).into(holder.imageProduct);
        int star=productList.get(position).product.rating_totals.get(position).stars;
        holder.ratingBar.setNumStars(star);
        int rating=productList.get(position).product.rating_totals.get(position).count;
        holder.titleTextView.setText(rating);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class productViewHolder extends RecyclerView.ViewHolder {
        ImageView imageProduct;
        RatingBar ratingBar;
        Button buyButton;
        FloatingActionButton like_button;
        TextView amountTextView,textView,countTextView,priceTextView ,titleTextView;
        public productViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView=itemView.findViewById(R.id.text_title);
            imageProduct=itemView.findViewById(R.id.image_product);
            buyButton=itemView.findViewById(R.id.buy_button);
            ratingBar=itemView.findViewById(R.id.ratingBar);
            like_button=itemView.findViewById(R.id.like_button);
            amountTextView=itemView.findViewById(R.id.text_amout);
            textView=itemView.findViewById(R.id.text_textView9);
            countTextView=itemView.findViewById(R.id.textView_count);
            priceTextView=itemView.findViewById(R.id.price);
        }
    }
}

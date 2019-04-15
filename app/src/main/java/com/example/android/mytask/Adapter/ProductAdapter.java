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

import com.example.android.mytask.Model.ProductsRate;
import com.example.android.mytask.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.productViewHolder> {
    protected Context context;
   private List<ProductsRate>productList;

    public ProductAdapter(Context context, List<ProductsRate> productList) {
        this.context = context;
        this.productList = productList;
    }

    //inflate data view
    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.productview,parent,false);
        return new productViewHolder(view);
    }
    //here we hold the view item with data from the a
    @Override
    public void onBindViewHolder(@NonNull productViewHolder holder, int position) {
        String name=productList.get(position).getProduct().getName();
        if(name!=null&&name.isEmpty()) {
            holder.nameTextView.setText(name);
        }else {
            holder.nameTextView.setText(String.valueOf(0));
        }
        String price=productList.get(position).getPrice();
        if(price!=null&&price.isEmpty()) {
            holder.priceTextView.setText(price);
        }
        else {
           holder.priceTextView.setText(String.valueOf(0));
        }

        String amout=productList.get(0).getAmount();
        if(amout!=null&&amout.isEmpty()) {
            holder.amountTextView.setText(amout);
        }else {
            holder.amountTextView.setText(String.valueOf(0));
        }


       String url_image=productList.get(position).getProduct().getPhoto_urlList().get(0).getImage_url();
       if(url_image !=null&&url_image.isEmpty()) {
           Uri uri = Uri.parse(url_image);
           Picasso.get().load(uri).into(holder.imageProduct);
       }


    }

    @Override
    public int getItemCount() {
        //to verify the item number
        return productList.size();
    }
    // the class that catch the item from the view
    class productViewHolder extends RecyclerView.ViewHolder {
        ImageView imageProduct;
        Button buybutton;
        RatingBar ratingBar;
        FloatingActionButton like_button;
        TextView amountTextView,priceTextView ,nameTextView;
        private productViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTextView=itemView.findViewById(R.id.name);
            imageProduct=itemView.findViewById(R.id.image_product);
            ratingBar=itemView.findViewById(R.id.ratingBar);
           // like_button=itemView.findViewById(R.id.like_button);
            amountTextView=itemView.findViewById(R.id.textamount);
            priceTextView=itemView.findViewById(R.id.textprice);


        }
    }
}

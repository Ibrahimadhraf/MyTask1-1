package com.example.android.mytask.Adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    protected Context mcontext;
   private List<ProductsRate>productList;

    public ProductAdapter(Context context, List<ProductsRate> productList) {
        this.mcontext = context;
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
        if(name!=null&&!name.isEmpty()) {
            holder.nameTextView.setText(name);
        }else {
            holder.nameTextView.setText("name");
        }
        String price=productList.get(position).getPrice();
        if(price!=null&&!price.isEmpty()) {
            holder.priceTextView.setText(price);
        }
        else {
           holder.priceTextView.setText("price");
        }

        String amout=productList.get(position).getAmount();
        if(amout!=null&&!amout.isEmpty()) {
            holder.amountTextView.setText(amout);
        }else {
            holder.amountTextView.setText("amount");
        }


       String url_image=productList.get(position).getProduct().getPhoto_urlList().get(0).getImage_url();
       if(url_image !=null&&!url_image.isEmpty()) {
           Uri uri = Uri.parse(url_image);
           Picasso.get().load(uri).into(holder.imageProduct);
       }

         int stars=productList.get(0).getProduct().getRating_totals().get(0).getStars();
         holder.ratingBar.setNumStars(stars);
         int rate=productList.get(0).getProduct().getRating_totals().get(0).getCount();
         holder.ratingBar.setRating(Float.intBitsToFloat(rate));
    }

    @Override
    public int getItemCount() {
        //to verify the item number
        return productList.size();
    }
    // the class that catch the item from the view
    class productViewHolder extends RecyclerView.ViewHolder {
        ImageView imageProduct;
        RatingBar ratingBar;
        FloatingActionButton like_button;
        TextView amountTextView,priceTextView ,nameTextView;
        private productViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTextView=itemView.findViewById(R.id.name);
            imageProduct=itemView.findViewById(R.id.image_product);
            ratingBar=itemView.findViewById(R.id.ratingBar);
        
            amountTextView=itemView.findViewById(R.id.textamount);
            priceTextView=itemView.findViewById(R.id.textprice);


        }
    }
}

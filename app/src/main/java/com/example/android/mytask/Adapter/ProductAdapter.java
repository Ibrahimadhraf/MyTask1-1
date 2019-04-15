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
        String name=productList.get(0).getProduct().getName();
        if(name!=null&&name.isEmpty()) {
            holder.titleTextView.setText(name);
        }else {
            holder.titleTextView.setText(String.valueOf(0));
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

         String count=productList.get(position).orderdetailsList.get(0).getCount();
        if(count != null &&count.isEmpty()) {
            holder.countTextView.setText(String.valueOf(count));
        }else {
            holder.countTextView.setText(String.valueOf(0));
        }
       String url_image=productList.get(position).getProduct().getPhoto_urlList().get(0).getImage_url();
       if(url_image !=null&&url_image.isEmpty()) {
           Uri uri = Uri.parse(url_image);
           Picasso.get().load(uri).into(holder.imageProduct);
       }
        String star=productList.get(position).getProduct().getRating_totals().get(0).getStars();
       if(star!=null&&star.isEmpty()) {
           holder.ratingBar.setRating(Integer.parseInt(star));
       }else {
           holder.ratingBar.setRating(0);
       }
        String rating=productList.get(position).product.rating_totals.get(0).count;
       if(star!=null&&star.isEmpty()) {
           holder.titleTextView.setText(rating);
       }else {
           holder.titleTextView.setText(String.valueOf(0));
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
        RatingBar ratingBar;
        Button buyButton;
        FloatingActionButton like_button;
        TextView amountTextView,textView,countTextView,priceTextView ,titleTextView;
        private productViewHolder(@NonNull View itemView) {
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

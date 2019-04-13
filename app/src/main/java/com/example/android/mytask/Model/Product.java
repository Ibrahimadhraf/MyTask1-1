package com.example.android.mytask.Model;

import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("name_en")
   public String name;
   public String stare;
   public String count;
     public int amount;
    @SerializedName("start_price")
   public String price;
    @SerializedName("photo")
   public String imageUrl;
    public Product(String name, String stare, String count, int amount, String price, String imageUrl) {
        this.name = name;
        this.stare = stare;
        this.count = count;
        this.amount = amount;
        this.price = price;
        this.imageUrl = imageUrl;
    }


}

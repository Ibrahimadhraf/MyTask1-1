package com.example.android.mytask.Model;

import com.google.gson.annotations.SerializedName;

public class Rating_total {
    @SerializedName("stars")
    public int stars;
    @SerializedName("count")
  public  int count;

    public Rating_total() {
    }

    public int getStars() {
        String.valueOf(stars);
        if(!String.valueOf(stars).isEmpty()) {
            return stars;
        }else return 2;
    }



    public int getCount() {
        return count;
    }


}

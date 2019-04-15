package com.example.android.mytask.Model;

import com.google.gson.annotations.SerializedName;

public class Rating_total {
    @SerializedName("stars")
    public String stars;
    @SerializedName("count")
  public   String count;

    public Rating_total() {
    }

    public String getStars() {
        return stars;
    }



    public String getCount() {
        return count;
    }


}

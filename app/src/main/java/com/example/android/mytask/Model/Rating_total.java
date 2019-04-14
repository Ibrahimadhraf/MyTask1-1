package com.example.android.mytask.Model;

import com.google.gson.annotations.SerializedName;

public class Rating_total {
    @SerializedName("stars")
    public int stars;
    @SerializedName("count")
  public   int count;

    public Rating_total() {
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

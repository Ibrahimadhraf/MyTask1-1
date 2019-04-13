package com.example.android.mytask.Model;

import com.google.gson.annotations.SerializedName;

public class Data {
    public int id;
    @SerializedName("name_en")
    public String name;
    @SerializedName("photo")
    public String imageUrl;

    public Data(int id, String name, String imageUrl) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
    }


}

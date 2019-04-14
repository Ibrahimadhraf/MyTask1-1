package com.example.android.mytask.Model;

import com.google.gson.annotations.SerializedName;

public class Photo_url {
    @SerializedName("photo")
    public String image_url;

    public Photo_url() {
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}

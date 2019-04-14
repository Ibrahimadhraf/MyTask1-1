package com.example.android.mytask.Model;

import com.google.gson.annotations.SerializedName;

public class Data {
  public int id;
  @SerializedName( "name_en")
    public String name;
  @SerializedName( "photo")
  public  String photoUrl;
  @SerializedName("name")
    public String name_en;

    public Data(int id, String name, String photoUrl, String name_en) {
        this.id = id;
        this.name = name;
        this.photoUrl = photoUrl;
        this.name_en = name_en;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}

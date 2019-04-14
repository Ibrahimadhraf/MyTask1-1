package com.example.android.mytask.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product {
    @SerializedName( "name_en")
   public String name;
    @SerializedName("total_rating")
    public List<Rating_total> rating_totals;
    @SerializedName("productphotos")
    public List<Photo_url>photo_urlList;
    int id;
    @SerializedName("name")
    public String name2;
    int cat_id;
    int subcat_id;
    String color_hex;
    String created;
    String modified;
    String description;
    String description_en;
    String  red;
    String green;
    String blue;

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public List<Rating_total> getRating_totals() {
  return rating_totals;
 }

 public void setRating_totals(List<Rating_total> rating_totals) {
  this.rating_totals = rating_totals;
 }

 public List<Photo_url> getPhoto_urlList() {
  return photo_urlList;
 }

 public void setPhoto_urlList(List<Photo_url> photo_urlList) {
  this.photo_urlList = photo_urlList;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName2() {
  return name2;
 }

 public void setName2(String name2) {
  this.name2 = name2;
 }

 public int getCat_id() {
  return cat_id;
 }

 public void setCat_id(int cat_id) {
  this.cat_id = cat_id;
 }

 public int getSubcat_id() {
  return subcat_id;
 }

 public void setSubcat_id(int subcat_id) {
  this.subcat_id = subcat_id;
 }

 public String getColor_hex() {
  return color_hex;
 }

 public void setColor_hex(String color_hex) {
  this.color_hex = color_hex;
 }

 public String getCreated() {
  return created;
 }

 public void setCreated(String created) {
  this.created = created;
 }

 public String getModified() {
  return modified;
 }

 public void setModified(String modified) {
  this.modified = modified;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public String getDescription_en() {
  return description_en;
 }

 public void setDescription_en(String description_en) {
  this.description_en = description_en;
 }

 public String getRed() {
  return red;
 }

 public void setRed(String red) {
  this.red = red;
 }

 public String getGreen() {
  return green;
 }

 public void setGreen(String green) {
  this.green = green;
 }

 public String getBlue() {
  return blue;
 }

 public void setBlue(String blue) {
  this.blue = blue;
 }
}

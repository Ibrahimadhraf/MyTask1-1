package com.example.android.mytask.Model;

import com.google.gson.annotations.SerializedName;

public class ProductsRate {
@SerializedName("start_price")
  public   String price;
 @SerializedName( "total_result")
 String current_price;
 public  String size;
 public String amount;

 @SerializedName("product")
 public Product product;

 public ProductsRate() {

 }

 public String getPrice() {
  return price;
 }

 public void setPrice(String price) {
  this.price = price;
 }


 public String getCurrent_price() {
  return current_price;
 }

 public void setCurrent_price(String current_price) {
  this.current_price = current_price;
 }

 public String getSize() {
  return size;
 }

 public void setSize(String size) {
  this.size = size;
 }

 public String getAmount() {
  return amount;
 }

 public void setAmount(String amount) {
  this.amount = amount;
 }

 public Product getProduct() {
  return product;
 }

 public void setProduct(Product product) {
  this.product = product;
 }
}

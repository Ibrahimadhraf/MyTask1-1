package com.example.android.mytask.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ProductsRate {
@SerializedName("start_price")
  public   String price;
 @SerializedName( "total_result")
 String result;
 int id;
 int product_id;
 String created;
 String modified;
 String current_price;
 public  String size;
 public String amount;
 @SerializedName( "total_rating")
  public List<OrderList> orderdetailsList;
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

 public String getResult() {
  return result;
 }

 public void setResult(String result) {
  this.result = result;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public int getProduct_id() {
  return product_id;
 }

 public void setProduct_id(int product_id) {
  this.product_id = product_id;
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

 public List<OrderList> getOrderdetailsList() {
  return orderdetailsList;
 }

 public void setOrderdetailsList(List<OrderList> orderdetailsList) {
  this.orderdetailsList = orderdetailsList;
 }

 public Product getProduct() {
  return product;
 }

 public void setProduct(Product product) {
  this.product = product;
 }
}

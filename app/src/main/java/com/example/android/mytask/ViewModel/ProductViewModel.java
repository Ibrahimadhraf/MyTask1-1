package com.example.android.mytask.ViewModel;

import android.content.Context;

import com.example.android.mytask.Model.Product;
import com.example.android.mytask.Network.DataServices;
import com.example.android.mytask.Network.RetrofitClient;

import java.util.List;

public class ProductViewModel {
    public Product mProduct;
    public List<Product>mProductList;
    public DataServices dataServices;
    public Context mcontext;

    public ProductViewModel( List<Product> mProductList,  Context mcontext) {
        this.mProduct = mProduct;
        this.mProductList = mProductList;
        this.dataServices = dataServices;
        this.mcontext = mcontext;
    }

    public ProductViewModel(Context mcontext) {
        this.dataServices = RetrofitClient.getApiServices();
        this.mcontext = mcontext;
    }

    public String getName() {
        return mProduct.name;
    }

    public void setName(String name) {
        this.mProduct.name = name;
    }

    public String getStare() {
        return mProduct.stare;
    }

    public void setStare(String stare) {
        this.mProduct.stare = stare;
    }

    public String getCount() {
        return mProduct.count;
    }

    public void setCount(String count) {
        this.mProduct.count = count;
    }

    public int getAmount() {
        return mProduct.amount;
    }

    public void setAmount(int amount) {
        this.mProduct.amount = amount;
    }

    public String getPrice() {
        return mProduct.price;
    }

    public void setPrice(String price) {
        this.mProduct.price = price;
    }

    public String getImageUrl() {
        return mProduct.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.mProduct.imageUrl = imageUrl;
    }


}

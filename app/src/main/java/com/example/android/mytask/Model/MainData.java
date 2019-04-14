package com.example.android.mytask.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MainData {
    @SerializedName("data")
    public List<Data>data;
    @SerializedName("productsbyrate")
   public List<ProductsRate>productsRates;

    public MainData(List<Data> data, List<ProductsRate> productsRates) {

    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public List<ProductsRate> getProductsRates() {
        return productsRates;
    }

    public void setProductsRates(List<ProductsRate> productsRates) {
        this.productsRates = productsRates;
    }
}

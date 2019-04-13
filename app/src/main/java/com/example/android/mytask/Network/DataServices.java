package com.example.android.mytask.Network;

import com.example.android.mytask.Model.Data;
import com.example.android.mytask.Model.Product;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataServices {
    @GET("Subcats/getsubcats.json")
    Observable<List<Data>> getData(
                                   @Query("id1") int id1,
                                   @Query("id2") int id2);
    Observable<List<Product>> getProduct(
            @Query("id1") int id1,
            @Query("id2") int id2);
}

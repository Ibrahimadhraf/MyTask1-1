package com.example.android.mytask.Network;

import com.example.android.mytask.Model.MainData;

import io.reactivex.Observable;
import retrofit2.http.GET;

//get the data from the Api
public interface DataServices {
    @GET("api/Subcats/getsubcats/2/2.json")
    Observable<MainData> getData();

    
}

package com.example.android.mytask.Network;

import android.content.Context;
import android.util.Log;

import com.example.android.mytask.Model.MainData;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static final String TAG=RetrofitClient.class.getSimpleName();
    private static final String BASE_URL ="http://shopgate.codesroots.com/api/Subcats /";
    private static Retrofit retrofit = null;
    public static Retrofit getRetrofitInstance(Context context){
        if(retrofit==null){
          retrofit= new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }
    private static  DataServices getApiServices(Context context){
        return getRetrofitInstance(context).create(DataServices.class);
    }
    public Observable<List<MainData>> fetchData(Context context){
        DataServices dataServices=RetrofitClient.getApiServices(context);
        return dataServices.getData();
    }
}

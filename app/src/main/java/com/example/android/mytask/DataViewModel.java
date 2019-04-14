package com.example.android.mytask;

import android.app.Application;
import android.content.Context;

import com.example.android.mytask.Model.MainData;
import com.example.android.mytask.Network.RetrofitClient;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import io.reactivex.Observable;

public class DataViewModel extends AndroidViewModel {
    public RetrofitClient clientt=new RetrofitClient();
    public DataViewModel(@NonNull Application application) {
        super(application);

    }
    public Observable<List<MainData>> fetchData(Context context){
        return clientt.fetchData(context);
    }
}

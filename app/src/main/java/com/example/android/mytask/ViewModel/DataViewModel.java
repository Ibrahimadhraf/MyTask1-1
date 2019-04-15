package com.example.android.mytask.ViewModel;

import android.app.Application;
import android.content.Context;

import com.example.android.mytask.Model.MainData;
import com.example.android.mytask.Network.RetrofitClient;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import io.reactivex.Observable;
//our view model that we use to attach between our operations code and acvtivity
public class DataViewModel extends AndroidViewModel {
    public RetrofitClient client=new RetrofitClient();
    public DataViewModel(@NonNull Application application) {
        super(application);

    }
    Observable<List<MainData>> fetchData(Context context){
        return client.fetchData(context);
    }
}

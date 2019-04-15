package com.example.android.mytask.Network;
import com.example.android.mytask.Model.MainData;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

//get the data from the Api
public interface DataServices {
    @GET("api/Subcats/getsubcats/2/2.json?fbclid=IwAR3yWLXGHbY1WvwARaDip3TZiw49VdUisZMSSC1uwqaz0Ku8eve9PcsvFU8")
    Observable<List<MainData>> getData();

    
}

package com.example.android.mytask.ViewModel;

import android.content.Context;
import com.example.android.mytask.Model.Data;
import com.example.android.mytask.Network.DataServices;
import com.example.android.mytask.Network.RetrofitClient;


import java.util.List;

public class DataViewModel {
    public DataServices mDatasevices;;
    public Data mdata;
    public Context mContext;
    public List<Data> mDataList;

    public DataViewModel( Context mContext, List<Data> mDataList) {
        this.mDatasevices = mDatasevices;
        this.mdata = mdata;
        this.mContext = mContext;
        this.mDataList = mDataList;
    }

    public DataViewModel(Context mContext) {
        this.mContext = mContext;
        mDatasevices=RetrofitClient.getApiServices();
    }


    public int getId() {
        return mdata.id;
    }

    public void setId(int id) {
        this.mdata.id = id;
    }

    public String getName() {
        return mdata.name;
    }

    public void setName(String name) {
        this.mdata.name = name;
    }

    public String getImageUrl() {
        return mdata.imageUrl;
    }

    public void setImageUrl(String imageUrl) {

        this.mdata.imageUrl = imageUrl;
    }
}

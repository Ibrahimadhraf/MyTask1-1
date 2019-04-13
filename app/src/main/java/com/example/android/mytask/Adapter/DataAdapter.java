package com.example.android.mytask.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.mytask.Model.Data;
import com.example.android.mytask.R;
import com.example.android.mytask.ViewModel.DataViewModel;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataAdapter extends RecyclerView.Adapter<DataRecyclerViewHolder> {
    Context context;
    DataViewModel model;

    public DataAdapter(Context context, List<Data>mDataList) {
        this.context = context;
        model=new DataViewModel(context,mDataList);
    }

    @NonNull
    @Override
    public DataRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.data_view,parent,false);
        return new  DataRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataRecyclerViewHolder holder, int position) {
         holder.mNameTextView.setText(model.mDataList.get(position).name);
        Picasso.with(context).load(model.mDataList.get(position).imageUrl).into(holder.mDataImageView);
    }

    @Override
    public int getItemCount() {
        return model.mDataList.size();
    }
}

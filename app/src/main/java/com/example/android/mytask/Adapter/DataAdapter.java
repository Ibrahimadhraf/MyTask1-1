package com.example.android.mytask.Adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.mytask.Model.Data;
import com.example.android.mytask.Model.MainData;
import com.example.android.mytask.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.RecyclerViewHolder>{
    public List<Data> dataList;
    public Context context;

    public DataAdapter() {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.data_view,parent,false);
        return new  RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
     holder.mNameTextView.setText(dataList.get(position).name);
     String str=dataList.get(position).photoUrl;
        Uri uri =Uri.parse(str);
        Picasso.get().load(uri).into(holder.mDataImageView);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView mNameTextView;
        ImageView mDataImageView;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            mNameTextView=(TextView)itemView.findViewById(R.id.text_data);
            mDataImageView=(ImageView)itemView.findViewById(R.id.image_data);
        }
    }
}


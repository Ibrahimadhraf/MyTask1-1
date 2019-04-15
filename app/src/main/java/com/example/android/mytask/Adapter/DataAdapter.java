package com.example.android.mytask.Adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.mytask.Model.Data;
import com.example.android.mytask.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.RecyclerViewHolder>{
    private List<Data> dataList;
    protected Context context;

    public DataAdapter(List<Data> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    //inflate data view
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.data_view,parent,false);
        return new  RecyclerViewHolder(view);
    }
       //here we hold the view item with data from the api
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        String name=dataList.get(0).getName();
        if(name!=null&&name.isEmpty()) {
            holder.mNameTextView.setText(name);
        }
     String str=dataList.get(0).getPhotoUrl();
     if(str !=null&&str.isEmpty()) {
         Uri uri = Uri.parse(str);
         Picasso.get().load(uri).into(holder.mDataImageView);
     }
    }

    @Override
    public int getItemCount() {
        //to verify the item number
        return dataList.size();
    }
      // the class that catch the item from the view
    class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView mNameTextView;
        ImageView mDataImageView;
       private RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            mNameTextView=itemView.findViewById(R.id.text_data);
            mDataImageView=itemView.findViewById(R.id.image_data);
        }
    }
}


package com.example.android.mytask.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.mytask.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class DataRecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView mNameTextView;
    ImageView mDataImageView;
    public DataRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        mNameTextView=(TextView)itemView.findViewById(R.id.text_data);
        mDataImageView=(ImageView)itemView.findViewById(R.id.image_data);
    }

}

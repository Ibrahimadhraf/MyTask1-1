package com.example.android.mytask.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductRecyclerViewHolder extends RecyclerView.ViewHolder {
    private TextView mTitleTextView,mSalaryTextView;
    public ProductRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}

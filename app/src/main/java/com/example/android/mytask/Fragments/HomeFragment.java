package com.example.android.mytask.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.mytask.Adapter.DataAdapter;
import com.example.android.mytask.Adapter.ProductAdapter;
import com.example.android.mytask.Model.Data;
import com.example.android.mytask.Model.MainData;
import com.example.android.mytask.Model.ProductsRate;
import com.example.android.mytask.R;
import com.example.android.mytask.ViewModel.DataViewModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class HomeFragment extends Fragment {
    //view model
    private DataViewModel viewModel;
    //data recycler view
   private RecyclerView mDataRecyclerView;
    //prouduct recyclerView
   private RecyclerView mProductRecyclerView;
    private CompositeDisposable disposable=new CompositeDisposable();


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.homefragment, container, false);
      mDataRecyclerView =view.findViewById(R.id.data_recyclerView);
        mDataRecyclerView.setHasFixedSize(true);
        mDataRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mProductRecyclerView=view.findViewById(R.id.recyclerView2);
        mProductRecyclerView.setHasFixedSize(true);
        mProductRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        viewModel= ViewModelProviders.of(this).get(DataViewModel.class);
        fetchdata();
        return view;
    }
    private void fetchdata() {
        disposable.add(
                viewModel.client.fetchData(getContext())
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<MainData>() {
                            @Override
                            public void accept(MainData mainData)  {
                                List<Data> data=mainData.getData();
                                DataAdapter adapter=new DataAdapter(data,getContext());
                                adapter.notifyDataSetChanged();
                                mDataRecyclerView.setAdapter(adapter);
                                List<ProductsRate> products=mainData.getProductsRates();
                                ProductAdapter madapter=new ProductAdapter(getContext(),products);
                                mProductRecyclerView.setAdapter(madapter);
                                madapter.notifyDataSetChanged();
                            }

                        }));

    }

    @Override
    public void onStop() {
        super.onStop();
        disposable.clear();
    }
}

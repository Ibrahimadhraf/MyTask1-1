package com.example.android.mytask;

import androidx.annotation.NonNull;

import com.example.android.mytask.Adapter.DataAdapter;
import com.example.android.mytask.Fragments.BuyingFragment;
import com.example.android.mytask.Fragments.HomeFragment;
import com.example.android.mytask.Fragments.NotificationFragment;
import com.example.android.mytask.Fragments.OffersFragment;
import com.example.android.mytask.Model.Data;
import com.example.android.mytask.ViewModel.DataViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    DataViewModel model;
    RecyclerView mDataRecyclerView;
    CompositeDisposable disposable=new CompositeDisposable();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);
        mDataRecyclerView=findViewById(R.id.data_recyclerView);
        mDataRecyclerView.setHasFixedSize(true);
        mDataRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        model=new DataViewModel(this);
        fetchData();
    }

    private void fetchData() {
        disposable.add(
                model.mDatasevices.getData(2,1)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<Data>>() {
                    @Override
                    public void accept(List<Data> data) throws Exception {
                     displayData(data);
                    }
                })
        );
    }

    private void displayData(List<Data> data) {
        DataAdapter adapter=new DataAdapter(this,data);
        mDataRecyclerView.setAdapter(adapter);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener listener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                                    Fragment selectFragment = null;
                                    switch (menuItem.getItemId()) {
                                        case R.id.nav_home:
                                            selectFragment = new HomeFragment();
                                            break;
                                        case R.id.nav_buy:
                                            selectFragment = new BuyingFragment();
                                            break;
                                        case R.id.nav_ofers:
                                            selectFragment = new OffersFragment();
                                            break;
                                        case R.id.nav_notification:
                                            selectFragment=new NotificationFragment();
                                            break;
                                        case R.id.nav_more:
                                            selectFragment=new NotificationFragment();
                                            default:
                                    }

                                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contaner,
                                            selectFragment ).commit();
                                    return true;
                                }
                            };

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
    }

    @Override
    protected void onStop() {
        super.onStop();
        disposable.clear();
    }
}






package com.example.android.mytask;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.mytask.Fragments.BuyingFragment;
import com.example.android.mytask.Fragments.HomeFragment;
import com.example.android.mytask.Fragments.NotificationFragment;
import com.example.android.mytask.Fragments.OffersFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);


    }
//add navigation button
    private BottomNavigationView.OnNavigationItemSelectedListener listener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                                    Fragment selectFragment=null;
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

                    assert selectFragment != null;
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,
                                            selectFragment ).commit();
                                    return true;
                                }
                            };








    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
    }

}






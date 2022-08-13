package com.example.uas_akb_if2_10119061;
/**
 * Nama : Rheiza Akmal Razzaky
 * Kelas : IF2
 * NIM :10119061
 * Email : rheiza.10119061@mahasiswa.unikom.ac.id
 * **/
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.uas_akb_if2_10119061.motnot.FragmentMonot;
import com.example.uas_akb_if2_10119061.ui.AboutActivity;
import com.example.uas_akb_if2_10119061.ui.ProfilActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomnavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize fragment
//        Fragment fragment = new MyLocationFragment();
//
//        //open Fragment
//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.fragment_container,fragment)
//                .commit();

        bottomnavigation = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentMonot()).commit();
        bottomnavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()){
                    case R.id.home:
                        selectedFragment = new FragmentMonot();
                        break;
                    case R.id.profile:
                        selectedFragment = new ProfilActivity();
                        break;
                    case R.id.about:
                        selectedFragment = new AboutActivity();
                        break;

                    case R.id.logout:
                        selectedFragment = new LogoutActivity();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                return true;
            }
        });


    }

}
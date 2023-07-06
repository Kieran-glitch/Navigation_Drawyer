package com.example.navigationdrawyer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    NavigationView Navbar;
    ActionBarDrawerToggle ABDT;
    DrawerLayout drawer;
    Toolbar tool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Navbar=findViewById(R.id.Navbar);
        drawer=findViewById(R.id.ID);
        tool=findViewById(R.id.toolbar);
        setSupportActionBar(tool);
        ABDT=new ActionBarDrawerToggle(this,drawer,tool,R.string.open,R.string.close);
        drawer.addDrawerListener(ABDT);
        ABDT.syncState();

        Navbar.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.Item1:
                        Toast.makeText(MainActivity.this,"Item 1", Toast.LENGTH_LONG).show();
                        drawer.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.Item2:
                        Toast.makeText(MainActivity.this,"Item 2",Toast.LENGTH_LONG).show();
                        drawer.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.Item3:
                        Toast.makeText(MainActivity.this,"Item 3",Toast.LENGTH_LONG).show();
                        drawer.closeDrawer(GravityCompat.START);
                        break;
                    default:
                        break;
                }
                return  true;
            }
        });

    }
}
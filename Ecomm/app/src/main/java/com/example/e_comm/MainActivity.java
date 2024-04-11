package com.example.e_comm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ImageView BurgerIcon;
DrawerLayout drawer;
RecyclerView rc;
List<item> items=new ArrayList<item>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BurgerIcon = findViewById(R.id.iv_MenuIcon);
        drawer = findViewById(R.id.DrwabelLayout);
        items.add(new item("T-Shirt","This Cloth Made In Egypt","150",R.drawable.a));
        items.add(new item("Jacket","This Cloth Made In Egypt","150",R.drawable.b));
        items.add(new item("T-Shirt","This Cloth Made In Egypt","150",R.drawable.c));
        items.add(new item("T-Shirt","This Cloth Made In Egypt","150",R.drawable.d));
        items.add(new item("T-Shirt","This Cloth Made In Egypt","150",R.drawable.b));
        items.add(new item("T-Shirt","This Cloth Made In Egypt","150",R.drawable.c));
        items.add(new item("T-Shirt","This Cloth Made In Egypt","150",R.drawable.d));


        BurgerIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.openDrawer(Gravity.LEFT);
            }
        });
     rc=findViewById(R.id.RecycleView);
     rc.setLayoutManager(new LinearLayoutManager(this));
     rc.setAdapter(new MyAdapter(getApplicationContext(),items));
    }


}
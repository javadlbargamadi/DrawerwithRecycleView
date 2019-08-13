package com.sematecjavaproject.drawerwithrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowDrawer = findViewById(R.id.btnShowDrawer);
        final DrawerLayout navDrawer = findViewById(R.id.navDrawer);



        RecyclerView recycler = findViewById(R.id.recyclerView);
        RecyclerAdapter adapter = new RecyclerAdapter();
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false));





        btnShowDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                navDrawer.openDrawer(GravityCompat.START);
            }
        });
    }
}

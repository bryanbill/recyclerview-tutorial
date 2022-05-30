package com.minty.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.minty.recycler.adapters.StringAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data.add("Item " + i);
        }


        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        StringAdapter adapter = new StringAdapter(this, data);
        //Vertical Scrolling
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        //Horizontal Scrolling
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
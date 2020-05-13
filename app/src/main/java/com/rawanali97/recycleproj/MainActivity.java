package com.rawanali97.recycleproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler_item =findViewById(R.id.recycler_item);
        recycler_item.setLayoutManager(new LinearLayoutManager(this));
        recycler_item.setHasFixedSize(true);

        List<String> listarray= Arrays.asList(getResources().getStringArray(R.array.listOfItem));
        MyAdopter adopter = new MyAdopter(listarray);
        recycler_item.setAdapter(adopter);
    }
}

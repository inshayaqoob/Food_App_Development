package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import Adapters.FoodAdapter;
import Models.FoodModel;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.reView);

        ArrayList<FoodModel> arrlist = new ArrayList<>();
        arrlist.add(new FoodModel(R.drawable.food1, "Burger"));
        arrlist.add(new FoodModel(R.drawable.food2, "Rice"));
        arrlist.add(new FoodModel(R.drawable.food3, "Shawarma"));
        arrlist.add(new FoodModel(R.drawable.food5, "Burger2"));
        arrlist.add(new FoodModel(R.drawable.food6, "Burger4"));

        FoodAdapter adapter = new FoodAdapter(arrlist, this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}

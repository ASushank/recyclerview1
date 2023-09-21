package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact o1 = new Contact(1,"9860590741", "Sushank");
    Contact o2 = new Contact(1,"9860590741", "Sushank");
    Contact o3 = new Contact(1,"9860590741", "Sushank");
    Contact o4 = new Contact(1,"9860590741", "Sushank");
    Contact o5 = new Contact(1,"9860590741", "Sushank");
    Contact o6 = new Contact(1,"9860590741", "Sushank");
    Contact o7 = new Contact(1,"9860590741", "Sushank");
    Contact o8 = new Contact(1,"9860590741", "Sushank");
    Contact o9 = new Contact(1,"9860590741", "Sushank");

    Contact []  contacts = {o1, o2, o3, o4, o5 ,o6, o7, o8, o9};
    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);


    }
}
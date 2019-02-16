package com.teamedge.android.museum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class traditions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traditions);

        ArrayList<CategoryItem> traditionsList =new ArrayList<>();
        traditionsList.add(new CategoryItem("Folklorico",R.drawable.folklorico));
        traditionsList.add(new CategoryItem("Cockfights",R.drawable.palenque));
        traditionsList.add(new CategoryItem("Bull Riding",R.drawable.bull));
        traditionsList.add(new CategoryItem("Food",R.drawable.tacos));

        CategoryAdapter adapter = new CategoryAdapter(this,traditionsList);
        ListView listView = findViewById(R.id.traditions);
        listView.setAdapter(adapter);
    }
}

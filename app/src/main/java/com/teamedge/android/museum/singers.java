package com.teamedge.android.museum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class singers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singers);

        ArrayList<CategoryItem> singersList =new ArrayList<>();
        singersList.add(new CategoryItem("Vicente Fernandez",R.drawable.vicente));
        singersList.add(new CategoryItem("Los Tigres del norte",R.drawable.tigres));
        singersList.add(new CategoryItem("El Fantasma",R.drawable.fantasma));
        singersList.add(new CategoryItem("T3r Elemento",R.drawable.elemento));

        CategoryAdapter adapter = new CategoryAdapter(this,singersList);
        ListView listView = findViewById(R.id.landmarks);
        listView.setAdapter(adapter);

    }
}

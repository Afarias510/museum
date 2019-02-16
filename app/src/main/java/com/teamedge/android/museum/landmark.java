package com.teamedge.android.museum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class landmark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmark);

        ArrayList<CategoryItem> landmarksList =new ArrayList<>();
        landmarksList.add(new CategoryItem("El Castillo",R.drawable.folklorico));
        landmarksList.add(new CategoryItem("Basilica de Santa Maria de Guadalupe",R.drawable.basilica));
        landmarksList.add(new CategoryItem("El Zocalo",R.drawable.zocalo));
        landmarksList.add(new CategoryItem("El Angel",R.drawable.angel));

        CategoryAdapter adapter = new CategoryAdapter(this,landmarksList);
        ListView listView = findViewById(R.id.landmarks);
        listView.setAdapter(adapter);

    }
}

package com.example.tami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {

                new Dish("Pecan and blueberry muffins", "Moist muffins made with pecan and fresh blueberry", 300),
                new Dish("Zongli’s juicy ass", "Blessing from Archon himself", 10000),
                new Dish("Pear and sesame pancake", "Crispy pancake filled with fresh pears and sesame", 450),
                new Dish("Amaranth and honey pudding", "A rich suet pudding made with amaranth and clear honey", 500),
                new Dish("Lime and cheese cheesecake", "A velvety cheesecake layered with fresh lime and cheese", 740),
                new Dish("Raspberry and hazelnut buns", "Rich buns made with fresh raspberry and hazelnut", 900),
                new Dish("Ginger and tea bread", "Fluffy bread made with fresh ginger and tea", 320),
                new Dish("Honey and mango cake", "Moist cake made with manuka honey and dried mango", 850),
                new Dish("Blackcurrant and chamomile cake", "Rich cake made with fresh blackcurrant and chamomile", 700),
                new Dish("Oatbran and date biscuits", "Crunchy biscuits made with oatbran and crunchy date", 700)

        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);
        dessertsList.setAdapter(dishesAdapter);
    }
}
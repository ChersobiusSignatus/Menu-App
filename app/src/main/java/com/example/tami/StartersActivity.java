package com.example.tami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        Dish[] dishes = {

                new Dish("Leek and peppercorn parcels", "Thin filo pastry cases stuffed with fresh leek and black peppercorn", 450),
                new Dish("Rosemary and mushroom dumplings", "Thin pastry cases stuffed with dried rosemary and portobello mushroom", 500),
                new Dish("Beetroot and truffle soup", "Fresh beetroot and truffle combined into creamy soup", 650),
                new Dish("Garlic and peppercorn soup", "Fresh garlic and pink peppercorn combined into creamy soup", 1500),
                new Dish("Nori and black pepper soup", "Nori and crushed black pepper combined into smooth soup", 800),
                new Dish("Tofu and spinach dumplings", "Thin pastry cases stuffed with silken tofu and fresh spinach", 2300),
                new Dish("Sweetcorn and celeriac parcels", "Thin filo pastry cases stuffed with baby sweetcorn and fresh celeriac", 720),
                new Dish("Tofu and mushroom wontons", "Thin wonton cases stuffed with silken tofu and wild mushroom", 1200),
                new Dish("Garam masala and celeriac gyoza", "Thin pastry cases stuffed with garam masala and fresh celeriac", 450),
                new Dish("Avocado and cucumber uramaki", "Fresh avocado and cucumber on a bed of sushi rice", 2200)

        };



        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);
    }
}
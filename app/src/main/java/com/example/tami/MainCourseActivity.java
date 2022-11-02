package com.example.tami;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[] mainCourses = {

                new Dish("Sole and padron salad", "Sole and padron served on a bed of lettuce", 500),
                new Dish("Mortadella and shank salad", "A crunchy salad featuring mortadella and shank", 2200),
                new Dish("Borscht and pasta salad", "Borscht and tagliatelle pasta served on a bed of lettuce", 450),
                new Dish("Plaice and corned beef salad", "A crunchy salad featuring plaice and canned corned beef", 650),
                new Dish("Ganyu's thicc thighs", "Fresh and meaty combined with cocogoat milk", 15000),
                new Dish("Tuna and tubetti fusilli", "Fresh egg pasta in a sauce made from tuna and tubetti", 450),
                new Dish("Pumpkin seed and chilli loaf", "Crunchy bread made with pumpkin seeds and spicy chilli", 800),
                new Dish("Leek and turtle bread", "Fluffy bread made with baby leek and turtle", 720),
                new Dish("Coconut and rambutan curry", "Mild curry made with fresh coconut and rambutan", 2300),
                new Dish("Garlic powder and adobo seasoning salad", "Garlic powder and adobo seasoning served on a bed of lettuce", 1200)

        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);

        mainCoursesList.setAdapter(dishesAdapter);
    }
}

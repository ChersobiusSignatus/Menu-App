package com.example.tami;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView startersCard;
    CardView mainCoursesCard;
    CardView dessertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainCoursesCard = findViewById(R.id.card_view_main_courses);
        dessertsCard = findViewById(R.id.card_view_desserts);

        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

                startActivity(startersActivityIntent);
            }
        });

        mainCoursesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCourseActivity.class);

                startActivity(mainCoursesActivityIntent);
            }
        });

        dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dessertsActivityIntent = new Intent(MainActivity.this, DessertsActivity.class);

                startActivity(dessertsActivityIntent);
            }
        });

        TextView emailTextView = findViewById(R.id.text_view_email_adress);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:tami@aqtobe.com"));
                startActivity(launchEmailAppIntent);

            }
        });
    }
}
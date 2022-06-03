package com.example.bumineun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Past_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.past_main);

        // Search Button
        ImageView search = (ImageView) findViewById(R.id.search_img);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Past_main.this, Search_empty.class);
                startActivity(intent);
            }
        });

        // Back button
        ImageView back = (ImageView) findViewById(R.id.back_img);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Past_main.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Main Button
        ImageView main = (ImageView) findViewById(R.id.logo_img);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Past_main.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
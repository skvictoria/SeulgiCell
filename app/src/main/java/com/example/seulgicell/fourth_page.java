package com.example.seulgicell;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class fourth_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Button food = findViewById(R.id.button2);
        food.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(getApplicationContext(), PopupFood.class);
                startActivity(intentt);
            }
        });

        Button movie = findViewById(R.id.button3);
        movie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(getApplicationContext(), PopupMovie.class);
                startActivity(intentt);
            }
        });

        Button shopping = findViewById(R.id.button4);
        shopping.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(getApplicationContext(), PopupShopping.class);
                startActivity(intentt);
            }
        });

        ImageButton button = findViewById(R.id.leftbutton_4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), third_page.class);
                startActivity(intent);
            }
        });

        ImageButton button2 = findViewById(R.id.rightbutton_4);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), fifth_page.class);
                startActivity(intent);
            }
        });
    }
}

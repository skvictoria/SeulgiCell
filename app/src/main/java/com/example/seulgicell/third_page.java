package com.example.seulgicell;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class third_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView textView = findViewById(R.id.textView22);
        textView.setMovementMethod(new ScrollingMovementMethod());

        ImageButton button = findViewById(R.id.leftbutton_3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), second_page.class);
                startActivity(intent);
            }
        });

        ImageButton button2 = findViewById(R.id.rightbutton_3);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), fourth_page.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.l8_intents_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView;
        textView=findViewById(R.id.textView);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("SS"));


    }
}
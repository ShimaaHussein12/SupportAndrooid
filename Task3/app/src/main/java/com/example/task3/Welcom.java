package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Welcom extends AppCompatActivity {
TextView welnameTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
        welnameTV=findViewById(R.id.welnameTV);
String NAME=getIntent().getStringExtra("key1");
        welnameTV.setText(NAME);
    }
}
package com.example.task4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycle;
    ArrayList<String> NOTE;
    EditText notEDT;
    ImageView IMG;
    NoteAdaptor adabt;
    String[]arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle=findViewById(R.id.RV);
        NOTE=new ArrayList<>();
        adabt=new NoteAdaptor(this);
        adabt.setDate(NOTE);
        recycle.setLayoutManager(new LinearLayoutManager(this));
        recycle.setAdapter(adabt);
        notEDT=findViewById(R.id.notetEDT);
        IMG=findViewById(R.id.IMG);
       IMG.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String text=notEDT.getText().toString();
               NOTE.add(text);
               adabt.setDate(NOTE);
               recycle.setAdapter(adabt);
           }
       });



    }

}

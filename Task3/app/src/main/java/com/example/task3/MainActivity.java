package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button signBTN,loginBTN;
EditText passwardEDT,emailEDT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signBTN=findViewById(R.id.signBTN);
        loginBTN=findViewById(R.id.loginBTN);
        passwardEDT=findViewById(R.id.passward2EDT);
        emailEDT=findViewById(R.id.email2EDT);
        signBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);

            }
        });
        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(passwardEDT.getText().toString().equals("")&&!emailEDT.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Enter your passward", Toast.LENGTH_SHORT).show();
                }
                else if(!passwardEDT.getText().toString().equals("")&&emailEDT.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Enter your email", Toast.LENGTH_SHORT).show();
                }
                else if(passwardEDT.getText().toString().equals("")&&emailEDT.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Enter your passward and email", Toast.LENGTH_SHORT).show();
                }
                else{
                    String email=emailEDT.getText().toString();
                    Toast.makeText(MainActivity.this, ""+email, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
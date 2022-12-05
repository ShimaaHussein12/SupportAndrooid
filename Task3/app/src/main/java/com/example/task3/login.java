package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class login extends AppCompatActivity {
Button sign2BTN,login2BTN;
EditText email2EDT,nameEDT,passward2EDT;
ImageView eyeIMAG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sign2BTN=findViewById(R.id.signup2BTN);
        login2BTN=findViewById(R.id.login2BTN);
        email2EDT=findViewById(R.id.email2EDT);
        nameEDT=findViewById(R.id.nameEDT);
        eyeIMAG=findViewById(R.id.eyeIMAG);
        passward2EDT=findViewById(R.id.passward2EDT);

        sign2BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nameEDT.getText().toString().equals("")&&!email2EDT.getText().toString().equals("")&&!passward2EDT.getText().toString().equals("")){
                    Toast.makeText(login.this, "enter your name", Toast.LENGTH_SHORT).show();
                }
                else if(!nameEDT.getText().toString().equals("")&&email2EDT.getText().toString().equals("")&&!passward2EDT.getText().toString().equals("")){
                    Toast.makeText(login.this, "enter your email", Toast.LENGTH_SHORT).show();
                }
                else if(!nameEDT.getText().toString().equals("")&&!email2EDT.getText().toString().equals("")&&passward2EDT.getText().toString().equals("")){
                    Toast.makeText(login.this, "enter your passward", Toast.LENGTH_SHORT).show();
                }
                else if(nameEDT.getText().toString().equals("")&&email2EDT.getText().toString().equals("")&&passward2EDT.getText().toString().equals("")){
                    Toast.makeText(login.this, "enter your name and email and passward", Toast.LENGTH_SHORT).show();
                }
                else{
               String name=nameEDT.getText().toString();
//                    Toast.makeText(login.this, ""+name, Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(login.this,Welcom.class);
                    intent.putExtra("key1",name);
                    startActivity(intent);

                }
            }

        });
        login2BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(login.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
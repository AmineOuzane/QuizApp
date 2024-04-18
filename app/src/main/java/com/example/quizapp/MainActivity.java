package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    Button sign;
    TextView register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        email.findViewById(R.id.Email);
        password.findViewById(R.id.Password);
        register.findViewById(R.id.register);

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("Amine") &&
                        password.getText().toString().equals("123")) {
                    Intent i1 = new Intent(MainActivity.this, Quiz1.class);
                } else {
                    Toast.makeText(getApplicationContext(), "login or password incorrect", Toast.LENGTH_SHORT);
                }
            }
            });

                register.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(getApplicationContext(), Register.class);
                        startActivity(i2);
                    }
                });
            }
        }


package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class Quiz2 extends AppCompatActivity {
    Button next;
    RadioGroup rg;
    RadioButton rb;
    int score;
    String correctresponse="1 année";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz2);

        next.findViewById(R.id.button2);
        rg.findViewById(R.id.rg2);
        Intent i2 = getIntent();
        i2.getIntExtra("score",0);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rg.getCheckedRadioButtonId() == -1){
                    Toast.makeText(getApplicationContext(),"Veuillez choisir une reponse",Toast.LENGTH_SHORT);
                }else {
                    rb=findViewById(rg.getCheckedRadioButtonId());
                    if(rb.getText().toString().equals(correctresponse)) score+=1;
                    Intent i1=new Intent(getApplicationContext(), Quiz3.class);
                }
        });

    }
}
}
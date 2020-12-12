package com.example.cg4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity7 extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        textView1 = (TextView) findViewById(R.id.card1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Activity7.this,Activity8.class);
                startActivity(intent1);
            }
        });
        textView2 = (TextView) findViewById(R.id.card2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Activity7.this, Activity9.class);
                startActivity(intent2);
            }
        });
        textView3 = (TextView) findViewById(R.id.card3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Activity7.this, Activity10.class);
                startActivity(intent3);
            }
        });
        textView4 = (TextView) findViewById(R.id.card4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Activity7.this, Activity11.class);
                startActivity(intent4);
            }
        });

    }
}
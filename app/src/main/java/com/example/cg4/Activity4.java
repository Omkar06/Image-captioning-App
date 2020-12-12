package com.example.cg4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity4 extends AppCompatActivity {

    ImageButton imageButton;
    ImageButton imageButton1;
    public Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        imageButton = (ImageButton) findViewById(R.id.ImageButtonGallery);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadActivate = new Intent(Activity4.this,Activity5.class);
                startActivity(intentLoadActivate);
            }
        });

        imageButton1 = (ImageButton) findViewById(R.id.ImageButtonCamera);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Activity4.this,Activity6.class);
                startActivity(intent1);
            }
        });
        

        button1 = (Button) findViewById(R.id.CaptionB);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Activity4.this,Activity7.class);
                startActivity(intent2);
            }
        });
    }
}
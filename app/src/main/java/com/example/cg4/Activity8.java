package com.example.cg4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);


        final TextView t1 = findViewById(R.id.text1);
        final TextView t2 = findViewById(R.id.text2);
        final TextView t3 = findViewById(R.id.text3);
        final TextView t4 = findViewById(R.id.text4);
        final TextView t5 = findViewById(R.id.text5);
        final TextView t6 = findViewById(R.id.text6);

        Button b1 = findViewById(R.id.copy1);
        Button b2 = findViewById(R.id.copy2);
        Button b3 = findViewById(R.id.copy3);
        Button b4 = findViewById(R.id.copy4);
        Button b5 = findViewById(R.id.copy5);
        Button b6 = findViewById(R.id.copy6);

        Button s1 = findViewById(R.id.share1);
        Button s2 = findViewById(R.id.share2);
        Button s3 = findViewById(R.id.share3);
        Button s4 = findViewById(R.id.share4);
        Button s5 = findViewById(R.id.share5);
        Button s6 = findViewById(R.id.share6);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("TextView", t1.getText().toString());
                assert clipboardManager != null;
                clipboardManager.setPrimaryClip(clipData);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("TextView", t2.getText().toString());
                assert clipboardManager != null;
                clipboardManager.setPrimaryClip(clipData);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("TextView", t3.getText().toString());
                assert clipboardManager != null;
                clipboardManager.setPrimaryClip(clipData);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("TextView", t4.getText().toString());
                assert clipboardManager != null;
                clipboardManager.setPrimaryClip(clipData);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("TextView", t5.getText().toString());
                assert clipboardManager != null;
                clipboardManager.setPrimaryClip(clipData);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("TextView", t6.getText().toString());
                assert clipboardManager != null;
                clipboardManager.setPrimaryClip(clipData);

            }
        });

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t1.getText().toString();
                Intent v1 = new Intent(Intent.ACTION_SEND);
                v1.setType("text/plain");
                v1.putExtra(Intent.EXTRA_SUBJECT, "I followed my heart and it led me to the beach");
                v1.putExtra(Intent.EXTRA_TEXT, text);
                startActivity(Intent.createChooser(v1, "share text via"));
            }
        });

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t2.getText().toString();
                Intent v2 = new Intent(Intent.ACTION_SEND);
                v2.setType("text/plain");
                v2.putExtra(Intent.EXTRA_SUBJECT, "High tides and good vibes");
                v2.putExtra(Intent.EXTRA_TEXT, text);
                startActivity(Intent.createChooser(v2, "share text via"));
            }
        });

        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t3.getText().toString();
                Intent v3 = new Intent(Intent.ACTION_SEND);
                v3.setType("text/plain");
                v3.putExtra(Intent.EXTRA_SUBJECT, "Eat. Sleep. Beach. Repeat.");
                v3.putExtra(Intent.EXTRA_TEXT, text);
                startActivity(Intent.createChooser(v3, "share text via"));
            }
        });

        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t4.getText().toString();
                Intent v4 = new Intent(Intent.ACTION_SEND);
                v4.setType("text/plain");
                v4.putExtra(Intent.EXTRA_SUBJECT, "Nothing soothes the soul like a walk on the Beach");
                v4.putExtra(Intent.EXTRA_TEXT, text);
                startActivity(Intent.createChooser(v4, "share text via"));
            }
        });

        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t5.getText().toString();
                Intent v5 = new Intent(Intent.ACTION_SEND);
                v5.setType("text/plain");
                v5.putExtra(Intent.EXTRA_SUBJECT, "Good times and tan lines");
                v5.putExtra(Intent.EXTRA_TEXT, text);
                startActivity(Intent.createChooser(v5, "share text via"));
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t6.getText().toString();
                Intent v6 = new Intent(Intent.ACTION_SEND);
                v6.setType("text/plain");
                v6.putExtra(Intent.EXTRA_SUBJECT, "People come and go, but the beach is Forever");
                v6.putExtra(Intent.EXTRA_TEXT, text);
                startActivity(Intent.createChooser(v6, "share text via"));
            }
        });

    }
}
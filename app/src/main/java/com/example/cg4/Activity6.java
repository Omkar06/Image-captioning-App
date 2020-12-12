package com.example.cg4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Activity6 extends AppCompatActivity {

    public static final int IMAGE_CAPTURE_CODE = 101;
    ImageView nImageView;
    Button captureBtn;
    Button savebtn;
    private static final int PERMISSION_CODE = 102;
    OutputStream outputStream;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        //
        nImageView = findViewById(R.id.image_view2);
        captureBtn = findViewById(R.id.capture_image);
        savebtn = findViewById(R.id.save_button);
        //
        captureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askCameraPermission();

            }
        });

        ActivityCompat.requestPermissions(Activity6.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        ActivityCompat.requestPermissions(Activity6.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);

        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savetogallery();
            }
        });
    }


    private void askCameraPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, IMAGE_CAPTURE_CODE);
        } else {
            openCamera();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == IMAGE_CAPTURE_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                openCamera();
            } else {
                Toast.makeText(this, "Permission Denied!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void openCamera() {
        Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camera, PERMISSION_CODE);

    }

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == PERMISSION_CODE) {
            Bitmap image = (Bitmap) data.getExtras().get("data");
            nImageView.setImageBitmap(image);
        }
    }

    private void savetogallery() {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) nImageView.getDrawable();
        Bitmap bitmap = bitmapDrawable.getBitmap();

        FileOutputStream outputStream = null;
        File file = Environment.getExternalStorageDirectory();
        File dir = new File(file.getAbsolutePath() + "/CaptionG");
        dir.mkdirs();
        String filename = String.format("%d.png", System.currentTimeMillis());
        File outFile = new File(dir, filename);
        try {
            outputStream = new FileOutputStream(outFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        try {
            outputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

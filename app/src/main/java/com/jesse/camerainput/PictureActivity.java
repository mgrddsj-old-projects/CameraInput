package com.jesse.camerainput;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_activity);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setImageBitmap((Bitmap) extras.get("data"));
    }

}

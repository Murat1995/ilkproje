package com.samyrat.applooo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chengaImage(View view){
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.metallica2);
    }


}
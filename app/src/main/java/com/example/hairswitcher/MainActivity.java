package com.example.hairswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int count = 0;

    public void switcher(View view){

        ImageView hair_1 = (ImageView) findViewById(R.id.hair_1);
        if(count == 0) {
            hair_1.setImageResource(R.drawable.hair_2);
            count++;
        }
        else {
            hair_1.setImageResource(R.drawable.hair_1);
            count = 0;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
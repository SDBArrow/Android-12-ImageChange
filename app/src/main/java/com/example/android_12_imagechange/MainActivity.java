package com.example.android_12_imagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //切換圖片
    public void chenge (View v){
        ImageView mface = (ImageView) findViewById(R.id.IV_face);
        mface.setImageDrawable(getResources().getDrawable(R.drawable.linchiling));
    }
}
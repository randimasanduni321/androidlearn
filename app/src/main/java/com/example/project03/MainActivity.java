package com.example.project03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method is called when the Next button is clicked
    public void goToNextActivity(View view) {
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
    }
}




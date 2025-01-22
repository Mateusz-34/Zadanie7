package com.example.multiactivityapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNavigate = findViewById(R.id.buttonNavigate);

        buttonNavigate.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivityForResult(intent, 1);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            String messageName = data.getStringExtra("messageName");
            String messageSurname = data.getStringExtra("messageSurname");

            TextView textViewName = findViewById(R.id.textViewName);
            TextView textViewSurname = findViewById(R.id.textViewSurname);

            textViewName.setText(messageName);
            textViewSurname.setText(messageSurname);
        }
    }
}
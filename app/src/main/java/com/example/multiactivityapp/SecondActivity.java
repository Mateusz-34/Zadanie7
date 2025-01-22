package com.example.multiactivityapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText Name = findViewById(R.id.Name);
        EditText Surname = findViewById(R.id.Surname);
        Button buttonBack = findViewById(R.id.buttonBack);

        buttonBack.setOnClickListener(v -> {
            String messageName = Name.getText().toString();
            String messageSurname = Surname.getText().toString();

            Intent intent = new Intent();
            intent.putExtra("messageName", messageName);
            intent.putExtra("messageSurname", messageSurname);

            setResult(RESULT_OK, intent);
            finish();
        });
    }
}
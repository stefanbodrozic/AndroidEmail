package com.example.emailapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.emailapp.R;

public class EmailsActivity extends AppCompatActivity {

    Button btnTestSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emails);

        btnTestSettings = findViewById(R.id.btnTestSettings);
        btnTestSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmailsActivity.this, SettingsActivity.class);
                startActivity(i);
            }
        });

    }
}
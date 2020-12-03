package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class dashboard extends AppCompatActivity {
    TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        username = findViewById(R.id.Name);
        Intent intent = getIntent();
        if(intent.getExtras() != null)
        {
            String passedUsername = intent.getStringExtra("data");
            username.setText("Welcome" + passedUsername);
        }
    }
}
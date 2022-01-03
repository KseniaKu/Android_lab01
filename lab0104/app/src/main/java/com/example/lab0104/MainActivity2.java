package com.example.lab0104;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        TextView tv= findViewById(R.id.tv);
       // String smth = intent.getStringExtra("smth", smth);
        Bundle arguments = getIntent().getExtras();
        String text = arguments.get("smth").toString();
        tv.setText(text);
    }
}
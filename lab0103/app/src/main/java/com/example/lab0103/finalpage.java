package com.example.lab0103;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class finalpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_finalpage);
        //TextView text = findViewById(R.id.text);
       // Bundle extras = getIntent().getExtras();
        //text.setText(extras.get("smth").toString());
        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();
            String name = arguments.get("smth").toString();
            textView.setText(name);
            setContentView(textView);
        }


    }

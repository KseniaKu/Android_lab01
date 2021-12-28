package com.example.lab0103;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 =findViewById(R.id.mybtn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1=findViewById(R.id.editText);
                String smth;
                smth = et1.getText().toString();
                Intent intent = new Intent(MainActivity.this, finalpage.class);

                intent.putExtra("smth", smth);
                startActivity(intent);
            }
        });

    }
}
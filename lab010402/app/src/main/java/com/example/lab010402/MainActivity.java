package com.example.lab010402;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 =findViewById(R.id.mybtn1);
        EditText et1=findViewById(R.id.editText);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smth= et1.getText().toString();
                Mainframe mf=new Mainframe();
                Bundle data = new Bundle();
                data.putString("smth",smth);
                mf.setArguments(data);
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fr, mf).commit();


            }
        });
    }
}
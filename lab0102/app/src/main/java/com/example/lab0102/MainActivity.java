package com.example.lab0102;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Calendar;
public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.mybtn1);
        txt1=findViewById(R.id.mytxt1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();

                String sDate = c.get(Calendar.YEAR) + "-"
                        + c.get(Calendar.MONTH)
                        + "-" + c.get(Calendar.DAY_OF_MONTH)
                        + " at " + c.get(Calendar.HOUR_OF_DAY)
                        + ":" + c.get(Calendar.MINUTE);
                //String curTime = hours + ":" + minutes + ":" + seconds;
                txt1.setText(sDate);

            }
        });

    }
}
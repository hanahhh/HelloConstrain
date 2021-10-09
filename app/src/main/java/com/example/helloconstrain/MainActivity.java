package com.example.helloconstrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button zero = findViewById(R.id.zero);
        Button countNum = findViewById(R.id.count);
        TextView textView = findViewById(R.id.textView);
        countNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 0) {
                    zero.setBackgroundColor(Color.CYAN);
                }
                ++count;
                textView.setText(Integer.toString(count));
                if(count%2 == 0){
                    countNum.setBackgroundColor(Color.GREEN);
                } else {
                    countNum.setBackgroundColor(Color.BLUE);
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zero.setBackgroundColor(Color.GRAY);
                count = 0;
                textView.setText("0");
            }
        });
    }
}
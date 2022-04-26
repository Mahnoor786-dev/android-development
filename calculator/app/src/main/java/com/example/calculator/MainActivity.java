package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity<s> extends AppCompatActivity {
    TextView number = findViewById(R.id.number);
    TextView output = findViewById(R.id.output);
    TextView button = findViewById(R.id.button);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int num = Integer.parseInt(number.getText().toString());
                 String line;
                 String table="";
                for (int i = 1; i <= 10 ; i++) {
                    line = num + " * " + i + "  =  " + num*i + "\n";
                    table+=line;
                }
                 output.setText(table);
            }
        });

    }
}
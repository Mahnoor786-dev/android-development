package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView count = findViewById(R.id.count);
        Button increment =findViewById(R.id.increasebtn);
        Button decrement = findViewById(R.id.decreasebtn);
        Button reset = findViewById(R.id.resetbtn);


        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int countVal = Integer.parseInt(count.getText().toString());
                countVal++;
                count.setText(Integer.toString(countVal));
            }
        });

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int countVal = Integer.parseInt(count.getText().toString());
                if(countVal!=0)
                    countVal--;
                count.setText(Integer.toString(countVal));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int countVal = Integer.parseInt(count.getText().toString());
                countVal=0;
                count.setText(Integer.toString(countVal));
            }
        });

    }
}
package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button ok;
    RadioGroup radioGroup;
    RadioButton green;
    RadioButton red;
    RadioButton yellow;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = findViewById(R.id.buttonOk);
        radioGroup = findViewById(R.id.group);
        green = findViewById(R.id.radioButtonGreen);
        red = findViewById(R.id.radioButtonRed);
        yellow = findViewById(R.id.radioButtonYellow);
        layout = findViewById(R.id.lineer);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (green.isChecked())
                {
                    layout.setBackgroundColor(Color.GREEN);
                }
                else if (red.isChecked())
                {
                    layout.setBackgroundColor(Color.RED);
                }
                else if (yellow.isChecked())
                {
                    layout.setBackgroundColor(Color.YELLOW);
                }
                
            }
        });
    }

}
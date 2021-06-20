package com.example.textviewbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textExample);
        button = findViewById(R.id.domagic);

        text.setTextColor(Color.BLACK);
        text.setText("This is an example");

        /*

        // ClickListener for textView

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setTextColor(Color.WHITE);
                text.setBackgroundColor(Color.BLACK);

            }
        });

        */

        // ClickListener for textView

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button.setBackgroundColor(Color.BLACK);
                text.setText("I have done my magic");
                text.setVisibility(View.INVISIBLE);
                button.setVisibility(View.INVISIBLE);

            }
        });


    }
}
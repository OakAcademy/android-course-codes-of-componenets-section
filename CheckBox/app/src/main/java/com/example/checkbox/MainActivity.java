package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    CheckBox male;
    CheckBox female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textViewResult);
        male = findViewById(R.id.checkBoxMale);
        female = findViewById(R.id.checkBoxFemale);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (male.isChecked())
                {
                    result.setText("Male");
                    female.setChecked(false);
                }
                else
                {
                    result.setText("What is your gender?");
                }

            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (female.isChecked())
                {
                    result.setText("Female");
                    male.setChecked(false);
                }
                else
                {
                    result.setText("What is your gender?");
                }

            }
        });

    }
}
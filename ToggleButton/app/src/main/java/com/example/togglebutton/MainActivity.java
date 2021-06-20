package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    ToggleButton toggleButton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageViewExample);
        toggleButton = findViewById(R.id.toggleButtonShow);
        result = findViewById(R.id.textViewResult);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked)
                {
                    image.setVisibility(View.INVISIBLE);
                    result.setText("Image is hidden");
                }
                else
                {
                    image.setVisibility(View.VISIBLE);
                    result.setText("Image is shown");
                }

            }
        });
    }
}
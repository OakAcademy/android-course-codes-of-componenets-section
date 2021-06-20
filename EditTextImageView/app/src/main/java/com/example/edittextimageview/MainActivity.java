package com.example.edittextimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button ok;
    TextView result;
    String userName;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextName);
        ok = findViewById(R.id.buttonOk);
        result = findViewById(R.id.textViewResult);
        image = findViewById(R.id.imageViewExample);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userName = name.getText().toString();
                result.setText(userName);

                image.setImageResource(R.drawable.b);

            }
        });

    }
}
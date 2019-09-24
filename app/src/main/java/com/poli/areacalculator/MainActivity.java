package com.poli.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    Button btnNext;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        btnNext = findViewById(R.id.button);
        btnNext.setOnClickListener(btnNextClick);
    }

    private OnClickListener btnNextClick = new OnClickListener() {
      public void onClick(View v) {
          int radioId = radioGroup.getCheckedRadioButtonId();
          radioButton = findViewById(radioId);
          switch (radioButton.getText().toString()) {
              case ("Triângulo"):
                  intent = new Intent(MainActivity.this, Triangle.class);
                  startActivity(intent);
                  break;
              case("Quadrado"):
                  intent = new Intent(MainActivity.this, Square.class);
                  startActivity(intent);
                  break;
              case("Círculo"):
                  intent = new Intent(MainActivity.this, Circle.class);
                  startActivity(intent);
                  break;
          }
      }
    };
}

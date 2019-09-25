package com.poli.areacalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Circle extends Activity {

    Button btnNext;
    Intent intent;
    EditText etRadius;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle);

        btnNext = findViewById(R.id.button2);
        btnNext.setOnClickListener(btnNextClick);
    }

    private View.OnClickListener btnNextClick = new View.OnClickListener() {
        public void onClick(View view) {
            intent = new Intent(Circle.this, CircleArea.class);
            etRadius = findViewById(R.id.radius);

            int radius = Integer.parseInt(etRadius.getText().toString());
            int area = (int) ((radius * radius) * Math.PI);

            intent.putExtra("area", area);

            startActivity(intent);
        }
    };
}

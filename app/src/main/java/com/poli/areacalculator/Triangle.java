package com.poli.areacalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Triangle extends Activity {
    Button btnNext;
    Intent intent;
    EditText etBase, etHeight;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangle);

        btnNext = findViewById(R.id.button4);
        btnNext.setOnClickListener(btnNextClick);
    }

    private View.OnClickListener btnNextClick = new View.OnClickListener() {
        public void onClick(View view) {
            intent = new Intent(Triangle.this, TriangleArea.class);

            etBase = findViewById(R.id.triangleBase);
            etHeight = findViewById(R.id.triangleHeight);

            int base = Integer.parseInt(etBase.getText().toString());
            int height = Integer.parseInt(etHeight.getText().toString());
            int area = (base * height) / 2;

            intent.putExtra("area", area);

            startActivity(intent);
        }
    };
}

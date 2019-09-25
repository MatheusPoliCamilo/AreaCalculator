package com.poli.areacalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Triangle extends Activity {
    Button btnNext;
    Intent intent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangle);

        btnNext = findViewById(R.id.button4);
        btnNext.setOnClickListener(btnNextClick);
    }

    private View.OnClickListener btnNextClick = new View.OnClickListener() {
        public void onClick(View view) {
            intent = new Intent(Triangle.this, TriangleArea.class);
            startActivity(intent);
        }
    };
}

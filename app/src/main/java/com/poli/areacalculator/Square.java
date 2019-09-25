package com.poli.areacalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Square extends Activity {

    Button btnNext;
    Intent intent;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.square);

        btnNext = findViewById(R.id.button3);
        btnNext.setOnClickListener(btnNextClick);
    }

    private View.OnClickListener btnNextClick = new View.OnClickListener() {
        public void onClick(View view) {
            intent = new Intent(Square.this, SquareArea.class);
            startActivity(intent);
        }
    };
}

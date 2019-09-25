package com.poli.areacalculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SquareArea extends Activity {

    TextView squareArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.square_area);
        squareArea = findViewById(R.id.squareArea);

        int area = this.getIntent().getIntExtra("area", 0);
        squareArea.setText(area + " m2");
    }

}

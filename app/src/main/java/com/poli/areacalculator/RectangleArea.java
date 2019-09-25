package com.poli.areacalculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RectangleArea extends Activity {

    TextView rectangleArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangle_area);
        rectangleArea = findViewById(R.id.rectangleArea);

        int area = this.getIntent().getIntExtra("area", 0);
        rectangleArea.setText(area + " m2");
    }

}

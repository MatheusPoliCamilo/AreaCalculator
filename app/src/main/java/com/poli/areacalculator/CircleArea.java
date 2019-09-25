package com.poli.areacalculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class CircleArea extends Activity {

    TextView circleArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle_area);
        circleArea = findViewById(R.id.circleArea);

        int area = this.getIntent().getIntExtra("area", 0);
        circleArea.setText(area + " m2");
    }

}

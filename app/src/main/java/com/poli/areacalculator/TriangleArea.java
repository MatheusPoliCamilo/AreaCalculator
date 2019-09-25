package com.poli.areacalculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TriangleArea extends Activity {

    TextView triangleArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangle_area);
        triangleArea = findViewById(R.id.triangleArea);

        int area = this.getIntent().getIntExtra("area", 0);
        triangleArea.setText(area + " m2");
    }

}

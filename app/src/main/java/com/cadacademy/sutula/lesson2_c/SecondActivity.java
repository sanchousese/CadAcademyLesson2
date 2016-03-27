package com.cadacademy.sutula.lesson2_c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvText = (TextView) findViewById(R.id.tvText);

        String text = getIntent().getStringExtra("textId");
        tvText.setText(text);
    }
}

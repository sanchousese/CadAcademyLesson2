package com.cadacademy.sutula.lesson2_c;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    TextView tvTitle;

    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        tvTitle = (TextView) findViewById(R.id.tvTitle);

        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOk:
                tvTitle.setText("Натиснено кнопку OK");
                Toast.makeText(this, "Натиснено кнопку OK", Toast.LENGTH_LONG).show();
                Log.d(TAG, "Натиснено кнопку OK");


                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra("textId", "Натиснено кнопку OK");
                startActivity(intent);


                break;
            case R.id.btnCancel:
                tvTitle.setText("Натиснено кнопку Cancel");
                Toast.makeText(this, "Натиснено кнопку Cancel", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Натиснено кнопку Cancel");
                break;
        }
    }
}

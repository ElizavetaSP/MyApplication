package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //comment
    private Button btn;
    private TextView tv;
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("AAAA", "onCreate");
        btn = findViewById(R.id.button);
        tv = findViewById(R.iid.textView);
        btn.setOnClickListener(view -> {

            counter++;
            tv.setText(Integer.toString(counter));
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value", counter);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("value");
        tv.setText(Integer.toString(counter));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAAA", "onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAAA", "onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAAA", "onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAAA", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAAA", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAAA", "onRestart");
    }
}
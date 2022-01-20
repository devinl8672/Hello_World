package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // User can tap a button to change the text color of the label
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change text color of label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.purple_700));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change text color of label
                findViewById(R.id.background).setBackgroundColor(getResources().getColor(R.color.white));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change text color of label
                ((TextView) findViewById(R.id.text)).setText(R.string.android_cheer);
            }
        });
    }
}
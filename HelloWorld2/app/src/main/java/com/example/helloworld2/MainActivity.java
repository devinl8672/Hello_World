package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

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

        //
        //  Reset the text to Hello from Devin
        //  Reset to color of the text to original color
        //  Reset the background color
        findViewById(R.id.background).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change text color of label
                textView.setText("Hello From Devin!");

                textView.setTextColor(getResources().getColor(R.color.black));

                findViewById(R.id.background).setBackgroundColor(getResources().getColor(R.color.cyan));
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (userEnteredText.isEmpty()) {
                    textView.setText("Enter Your Own Text: ");
                }
                else {
                    textView.setText(userEnteredText);
                }
            }
        });
    }
}
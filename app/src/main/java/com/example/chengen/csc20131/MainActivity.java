package com.example.chengen.csc20131;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int age = Integer.parseInt(firstNumEditText.getText().toString());
                int height = Integer.parseInt(secondNumEditText.getText().toString());

                if (age > 50 || height > 60) {
                    resultTextView.setText("True you are over 50 years or your height is over 60 inches");
                } else
                    resultTextView.setText("False you are under 50 years or your height is under 60 inches  ");
            }
        });
    }
}

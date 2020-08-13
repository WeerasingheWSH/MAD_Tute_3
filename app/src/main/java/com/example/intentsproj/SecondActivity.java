package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    int number1;
    int number2;
    int ans;
    TextView answer;
    Button add;
    Button sub;
    Button mul;
    Button div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1= (EditText) findViewById(R.id.editTextNumber);
        num2= (EditText) findViewById(R.id.editTextNumber2);
        answer = findViewById(R.id.textView2);
        add = (Button) findViewById(R.id.button2);
        sub = (Button) findViewById(R.id.button3);
        mul = (Button) findViewById(R.id.button4);
        div = (Button) findViewById(R.id.button5);

        Intent intent = getIntent();

        number1 = intent.getIntExtra("Num1", 0);
        number2 = intent.getIntExtra("Num2",0);

        Log.e("number1", String.valueOf(number1));
        Log.e("number2", String.valueOf(number2));

        num1.setText(""+number1);
        num2.setText(""+number2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
                answer.setText(number1+ "+" +number2+" = "+""+ans);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
                answer.setText(number1+ "-"+number2+" = "+""+ans);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
                answer.setText(number1+ "*"+number2+" = "+""+ans);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
                answer.setText(number1+ "/"+number2+" = "+""+ans);
            }
        });

    }
}



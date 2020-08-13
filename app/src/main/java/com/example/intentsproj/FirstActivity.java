package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    public void SendMessage(View view){

        Intent intent = new Intent(this,SecondActivity.class);

        EditText editText =  (EditText) findViewById(R.id.editTextNumber);
        EditText editText1 = (EditText) findViewById(R.id.editTextNumber2);

        intent.putExtra("Num1", Integer.parseInt(editText.getText().toString()));
        intent.putExtra("Num2", Integer.parseInt(editText1.getText().toString()));

        Context context = getApplicationContext();                //The context to use. Usually your Application or Activity object
        CharSequence message = "You just clicked the OK button";  //Display string
        int duration = Toast.LENGTH_SHORT;                        //How long the toast message will lasts
        Toast toast = Toast.makeText(context, message, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
        toast.show();

        startActivity(intent);

    }
}
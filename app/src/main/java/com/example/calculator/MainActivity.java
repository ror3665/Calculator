package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNum1, editTextNum2;
    int num1, num2;
    TextView textViewResult;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = (EditText) findViewById(R.id.editText_Number1);
        editTextNum2 = (EditText) findViewById(R.id.editText_Number2);
        textViewResult = (TextView) findViewById(R.id.textView_result);
    }

    public void addOnClick(View v) {
        num1 = Integer.parseInt(editTextNum1.getText().toString());
        num2 = Integer.parseInt(editTextNum2.getText().toString());
        result = Integer.toString(num1 + num2);

        textViewResult.setText("계산결과 : " + result);
    }

    public void subOnClick(View v) {
        num1 = Integer.parseInt(editTextNum1.getText().toString());
        num2 = Integer.parseInt(editTextNum2.getText().toString());
        result = Integer.toString(num1 - num2);

        textViewResult.setText("계산결과 : " + result);
    }

    public void mulOnClick(View v) {
        num1 = Integer.parseInt(editTextNum1.getText().toString());
        num2 = Integer.parseInt(editTextNum2.getText().toString());
        result = Integer.toString(num1 * num2);

        textViewResult.setText("계산결과 : " + result);
    }

    public void divOnClick(View v) {
        num1 = Integer.parseInt(editTextNum1.getText().toString());
        num2 = Integer.parseInt(editTextNum2.getText().toString());
        result = Integer.toString(num1 / num2);

        textViewResult.setText("계산결과 : " + result);
    }

    public void eOnClick(View v) {
        num1 = Integer.parseInt(editTextNum1.getText().toString());
        num2 = Integer.parseInt(editTextNum2.getText().toString());
        result = Integer.toString(num1 % num2);

        textViewResult.setText("계산결과 : " + result);
    }
}
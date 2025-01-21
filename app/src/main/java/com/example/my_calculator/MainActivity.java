package com.example.my_calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextUtils;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private EditText editTextText, editTextText2;
    private Button button1, button2, button3, button4;
    private Button button_clear;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);
        editTextText = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button_clear = findViewById(R.id.button_clear);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("+");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("-");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("*");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("/");
            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextText.setText("");
                editTextText2.setText("");
                resultTextView.setText("Введите числа");

            }
        });

    }


    private void calculate(String operation){
        String num1Str = editTextText.getText().toString();
        String num2Str = editTextText2.getText().toString();

        if (TextUtils.isEmpty(num1Str)) {
            resultTextView.setText("Пожалуйста, введите первое число");
            return;
        }
        if (TextUtils.isEmpty(num2Str)) {
            resultTextView.setText("Пожалуйста, введите второе число");
            return;
        }


        float num1 = Float.parseFloat(num1Str);
        float num2 = Float.parseFloat(num2Str);
        float res = 0;
        if (operation.equals("+")) {
            res = num1 + num2;
        } else if(operation.equals("-")) {
            res = num1 - num2;
        } else if (operation.equals("*")) {
            res = num1 * num2;
        } else if (operation.equals("/")) {
            if(num2 == 0) {
                resultTextView.setText("Деление на ноль недопустимо");
                return;
            }
            res = num1/num2;
        }
        resultTextView.setText(String.valueOf(res));
    }
}


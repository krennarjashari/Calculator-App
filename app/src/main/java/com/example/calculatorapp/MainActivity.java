package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7,
    button8, button9, buttonPoint, buttonClear, buttonEqual, buttonAdd, buttonSub, buttonMultiplication,
    buttonDivision;

    EditText editText;

    float valueOne, valueTwo;

    boolean isAddition, isSub, isMultiplication, isDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        onClicks();
    }

    private void onClicks() {
    }

    private void findViews() {

        button0=findViewById(R.id.btnZero);
        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);
        button4=findViewById(R.id.btn4);
        button5=findViewById(R.id.btn5);
        button6=findViewById(R.id.btn6);
        button7=findViewById(R.id.btn7);
        button8=findViewById(R.id.btn8);
        button9=findViewById(R.id.btn9);
        buttonClear=findViewById(R.id.btnClear);
        buttonAdd=findViewById(R.id.btnAddition);
        buttonMultiplication=findViewById(R.id.btnMultiplication);
        buttonDivision=findViewById(R.id.btnDivision);
        buttonEqual=findViewById(R.id.btnEqual);
        buttonPoint=findViewById(R.id.btnPoint);
        buttonSub=findViewById(R.id.btnSubstraction);
        editText=findViewById(R.id.etResult);


    }
}
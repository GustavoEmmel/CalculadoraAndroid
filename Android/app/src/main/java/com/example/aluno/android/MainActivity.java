package com.example.aluno.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private int var1;
    private int operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edShow = (EditText) findViewById(R.id.textNumber);

        Button number1 = (Button) findViewById(R.id.numberOne);
        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String text = edShow.getText().toString();
                edShow.setText(text+"1");
            }
        });

        Button number2 = (Button) findViewById(R.id.numberTwo);
        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String text = edShow.getText().toString();
                edShow.setText(text+"2");
            }
        });

        Button number3 = (Button) findViewById(R.id.numberThree);
        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String text = edShow.getText().toString();
                edShow.setText(text+"3");
            }
        });

        Button number4 = (Button) findViewById(R.id.numberFour);
        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String text = edShow.getText().toString();
                edShow.setText(text+"4");
            }
        });

        Button number5 = (Button) findViewById(R.id.numberFive);
        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String text = edShow.getText().toString();
                edShow.setText(text+"5");
            }
        });

        Button number6 = (Button) findViewById(R.id.numberSix);
        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String text = edShow.getText().toString();
                edShow.setText(text+"6");
            }
        });

        Button number7 = (Button) findViewById(R.id.numberSeven);
        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String text = edShow.getText().toString();
                edShow.setText(text+"7");
            }
        });

        Button number8 = (Button) findViewById(R.id.numberEight);
        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String text = edShow.getText().toString();
                edShow.setText(text+"8");
            }
        });

        Button number9 = (Button) findViewById(R.id.numberNine);
        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String text = edShow.getText().toString();
                edShow.setText(text+"9");
            }
        });

        Button number0 = (Button) findViewById(R.id.numberZero);
        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String text = edShow.getText().toString();
                edShow.setText(text+"0");
            }
        });

        Button clean = (Button) findViewById(R.id.buttonClean);
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                edShow.setText("");
            }
        });
    }
}

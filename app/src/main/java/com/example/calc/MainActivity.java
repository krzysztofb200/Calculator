package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    public EditText e1, e2;
    double num1;
    double num2;
    TextView t1;
    Button sum, sub, div, mul, pow, mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.result);
        sum = findViewById((R.id.sum));
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getNumbers()) {
                    double x = num1 + num2;
                    t1.setText(Double.toString(x));
                } else {
                    t1.setText("Podano zle wartosci");
                }
            }
        });

        sub = findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getNumbers()) {
                    double x = num1 - num2;
                    t1.setText(Double.toString(x));
                } else {
                    t1.setText("Podano zle wartosci");
                }
            }
        });

        mul = findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getNumbers()) {
                    double x = num1 * num2;
                    t1.setText(Double.toString(x));
                } else {
                    t1.setText("Podano zle wartosci");
                }
            }
        });

        div = findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getNumbers()) {
                    double x = num1 / num2;
                    t1.setText(Double.toString(x));
                } else {
                    t1.setText("Podano zle wartosci");
                }
            }
        });

        pow = findViewById(R.id.pow);
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getNumbers()) {
                    double x = Math.pow(num1, num2);
                    t1.setText(Double.toString(x));
                } else {
                    t1.setText("Podano zle wartosci");
                }
            }
        });

        mod = findViewById(R.id.mod);
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getNumbers()) {
                    double x = num1 % num2;
                    t1.setText(Double.toString(x));
                } else {
                    t1.setText("Podano zle wartosci");
                }
            }
        });
    }

    public boolean getNumbers() {
        e1 = findViewById(R.id.num1);
        e2 = findViewById(R.id.num2);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        if(e1.length() == 0 || e2.length() == 0){
            Toast.makeText(this, "Nie podales jednej lub obu liczb", Toast.LENGTH_SHORT).show();
            return true;
        }
        else{
            num1 = Double.parseDouble(s1);
            num2 = Double.parseDouble(s2);
        }
        return true;
    }
}
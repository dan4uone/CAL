package com.example.lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer first, second;
    private Boolean isOperationClick;
    private String position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);

    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                //нажал на единицу
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else if (isOperationClick) {
                    tvResult.setText("1");
                } else {
                    tvResult.append("1");
                }
                isOperationClick = false;
                break;
            case R.id.btn_two:
                //нажал на двойку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else if (isOperationClick) {
                    tvResult.setText("2");
                } else {
                    tvResult.append("2");
                }
                isOperationClick = false;
                break;
            case R.id.btn_clear:
                tvResult.setText("0");
                first = 0;
                second = 0;
                break;
            case R.id.three:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                } else if (isOperationClick) {
                    tvResult.setText("3");
                } else {
                    tvResult.append("3");
                }
                isOperationClick = false;
                break;
            case R.id.four:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("4");
                } else if (isOperationClick) {
                    tvResult.setText("4");
                } else {
                    tvResult.append("4");
                }
                isOperationClick = false;
                break;
            case R.id.five:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else if (isOperationClick) {
                    tvResult.setText("5");
                } else {
                    tvResult.append("5");
                }
                isOperationClick = false;
                break;
            case R.id.six:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                } else if (isOperationClick) {
                    tvResult.setText("6");
                } else {
                    tvResult.append("6");
                }
                isOperationClick = false;
                break;
            case R.id.seven:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("7");
                } else if (isOperationClick) {
                    tvResult.setText("7");
                } else {
                    tvResult.append("7");
                }
                isOperationClick = false;
                break;
            case R.id.eight:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("8");
                } else if (isOperationClick) {
                    tvResult.setText("8");
                } else {
                    tvResult.append("8");
                }
                isOperationClick = false;
                break;
            case R.id.nine:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                } else if (isOperationClick) {
                    tvResult.setText("9");
                } else {
                    tvResult.append("9");
                }
                isOperationClick = false;
                break;
            case R.id.zero:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                } else if (isOperationClick) {
                    tvResult.setText("0");
                } else {
                    tvResult.append("0");
                }
                isOperationClick = false;
                break;

        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                //12
                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                position = "+";

                break;
            case R.id.minus:
                //12
                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                position = "-";
                break;
            case R.id.multiplication:
                //12
                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                position = "*";

                break;
            case R.id.deleniye:
                //12
                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                position = "/";

                break;


            case R.id.btn_equal:
                second = Integer.parseInt(tvResult.getText().toString());
                Integer result = 0;
                tvResult.setText(result.toString());
                isOperationClick = true;
                switch (position) {
                    case "+":
                        result = first + second;
                        tvResult.setText(result.toString());
                        break;
                    case "-":
                        result = first - second;
                        tvResult.setText(result.toString());
                        break;
                    case "*":
                        result = first * second;
                        tvResult.setText(result.toString());
                        break;
                    case "/":
                        result = first / second;
                        tvResult.setText(result.toString());
                        break;


                }
                break;
        }
    }
}
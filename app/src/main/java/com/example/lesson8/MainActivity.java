package com.example.lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_Result;
    private Double firstVar;
    private Double secondVar;
    private Boolean isOperationClick;
    private String operation;
    private Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_Result = findViewById(R.id.tv_result);
        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String result = tv_Result.getText().toString();
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                setTv_Result("1");
                break;
            case R.id.btn_two:
                setTv_Result("2");
                break;
            case R.id.three:
                setTv_Result("3");
                break;
            case R.id.four:
                setTv_Result("4");
                break;
            case R.id.five:
                setTv_Result("5");
                break;
            case R.id.six:
                setTv_Result("6");
                break;
            case R.id.seven:
                setTv_Result("7");
                break;
            case R.id.eight:
                setTv_Result("8");
                break;
            case R.id.nine:
                setTv_Result("9");
                break;
            case R.id.zero:
                setTv_Result("0");
                break;
            case R.id.btn_clear:
                tv_Result.setText("0");
                firstVar = 0.0;
                secondVar = 0.0;
                break;
            case R.id.dot:
                setTv_Result(".");
                break;
            case R.id.negative:
                setTv_Result("-");
                break;
        }
        btn_next.setVisibility(View.INVISIBLE);
    }

    public void setTv_Result(String numbers) {
        if(tv_Result.getText().toString().equals("0")){
            tv_Result.setText(numbers);
        }else if(isOperationClick) {
            tv_Result.setText(numbers);
        }else {
            tv_Result.append(numbers);
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        btn_next.setVisibility(View.INVISIBLE);
        switch (view.getId()){
            case R.id.procent:
                setFirstVar();
                isOperationClick = true;
                operation = "%";
                break;
            case R.id.btn_plus:
                setFirstVar();
                isOperationClick = true;
                operation = "+";
                break;
            case R.id.minus:
                setFirstVar();
                isOperationClick = true;
                operation = "-";
                break;
            case R.id.multiplication:
                setFirstVar();
                isOperationClick = true;
                operation = "X";
                break;
            case R.id.deleniye:
                setFirstVar();
                isOperationClick = true;
                operation = "/";
                break;
            case R.id.btn_equal:
                setSecondVar();
                Double result = 0.0;
                btn_next.setVisibility(View.VISIBLE);
                switch (operation){
                    case "%":
                        result = (firstVar / 100.0f);
                        tv_Result.setText(result.toString());
                        break;
                    case "+":
                        result = firstVar + secondVar;
                        tv_Result.setText(result.toString());
                        break;
                    case "-":
                        result = firstVar - secondVar;
                        tv_Result.setText(result.toString());
                        break;
                    case "X":
                        result = firstVar * secondVar;
                        tv_Result.setText(result.toString());
                        break;
                    case "/":
                        result = firstVar / secondVar;
                        tv_Result.setText(result.toString());
                        break;
                }
                break;
        }
    }

    public void setFirstVar() {
        firstVar = Double.parseDouble(tv_Result.getText().toString());
    }

    public void setSecondVar() {
        secondVar = Double.parseDouble(tv_Result.getText().toString());
    }
}

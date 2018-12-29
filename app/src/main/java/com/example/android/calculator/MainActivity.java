package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int result=0;
    int resultdiv=1;
    char op;

   int number1;
    EditText n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n2 = (EditText) findViewById(R.id.n);
    }


    public void equal(View view) {
        number1=Integer.parseInt(n2.getText().toString());
        if(op=='+')
        {
            result+=number1;
            n2.setText(Integer.toString( result));
            result=0;
        }
        if(op=='-')
        {
            result-=number1;
            n2.setText(Integer.toString( result));
            result=0;
        }
        if(op=='*')
        {
            result*=number1;
            n2.setText(Integer.toString( result));
            result=0;
        }
        if(op=='/')
        {
            resultdiv/=number1;
            n2.setText(Integer.toString(resultdiv));
            resultdiv=1;
        }
    }

    public void add(View view) {
        number1=Integer.parseInt(n2.getText().toString());
        result+=number1;
        n2.setText(null);
        op='+';

    }

    public void sub(View view) {
        number1=Integer.parseInt(n2.getText().toString());
        result=number1-result;
        n2.setText(null);
        op='-';
    }

    public void div(View view) {

        number1=Integer.parseInt(n2.getText().toString());
        resultdiv=number1/resultdiv;
        n2.setText(null);
        op='/';
    }

    public void mul(View view) {

        number1=Integer.parseInt(n2.getText().toString());
        result=number1;
        n2.setText(null);
        op='*';
    }

    public void reset(View view) {
        n2.setText(null);
        result=0;
        number1=0;
    }
}

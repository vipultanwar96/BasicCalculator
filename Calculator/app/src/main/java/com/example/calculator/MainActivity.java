package com.example.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int val1,val2,result=0;
    Button add,sub,mult,div;
    TextView res;
    EditText first,second;
    /*InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
    imm.hideSoftInputFromWindow(second.getWindowToken(), 0);**/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mult = (Button) findViewById(R.id.mult);
        div = (Button) findViewById(R.id.div);
        res = (TextView) findViewById(R.id.res);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().length()!=0 && second.getText().length()!=0)
                {
                    val1 = Integer.parseInt(first.getText()+"");
                    val2 = Integer.parseInt(second.getText()+"");
                    result = val1+val2;
                    res.setText(result.toString());
                }
                else
                {
                    res.setText("Enter the data in both lines");
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().length()!=0 && second.getText().length()!=0)
                {
                    val1 = Integer.parseInt(first.getText()+"");
                    val2 = Integer.parseInt(second.getText()+"");
                    result = val1-val2;
                    res.setText(result+"");
                }
                else
                {
                    res.setText("Enter the data in both lines");
                }
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().length()!=0 && second.getText().length()!=0)
                {
                    val1 = Integer.parseInt(first.getText()+"");
                    val2 = Integer.parseInt(second.getText()+"");
                    result = val1*val2;
                    res.setText(result+"");
                }
                else
                {
                    res.setText("Enter the data in both lines");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().length()!=0 && second.getText().length()!=0 && second.getText().equals("0"))
                {
                    val1 = Integer.parseInt(first.getText()+"");
                    val2 = Integer.parseInt(second.getText()+"");
                    result = val1/val2;
                    res.setText(result+"");
                }
                else
                {
                    res.setText("Enter the data in both lines");
                }
            }
        });
    }
}

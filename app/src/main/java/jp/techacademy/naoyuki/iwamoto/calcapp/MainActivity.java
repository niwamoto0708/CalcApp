package jp.techacademy.naoyuki.iwamoto.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView m1TextView;
    EditText m1EditText;
    TextView m2TextView;
    EditText m2EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        m1TextView = (TextView) findViewById(R.id.textView1);
        m1EditText = (EditText) findViewById(R.id.editText1);
        m2TextView = (TextView) findViewById(R.id.textView2);
        m2EditText = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View v) {
        String text1 = m1EditText.getText().toString();
        String text2 = m2EditText.getText().toString();

        Double num1 = Double.parseDouble(text1);
        Double num2 = Double.parseDouble(text2);
        Double but;

        if (v.getId() == R.id.button1) {
            but = num1 + num2;
        } else if (v.getId() == R.id.button2) {
            but = num1 - num2;
        } else if (v.getId() == R.id.button3) {
            but = num1 * num2;
        } else {
            but = num1 / num2;
        }

        

    }

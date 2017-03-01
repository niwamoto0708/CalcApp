package jp.techacademy.naoyuki.iwamoto.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


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
        //if (m1EditText.getText().toString().equals("")) {
        //    Toast.makeText(this, "数字が未入力です", Toast.LENGTH_SHORT).show();
        //    return;
        //}
        m2TextView = (TextView) findViewById(R.id.textView2);
        m2EditText = (EditText) findViewById(R.id.editText2);
        //if (m2EditText.getText().toString().equals("")) {
        //    Toast.makeText(this, "数字が未入力です", Toast.LENGTH_SHORT).show();
        //    return;
        //}
        }
    @Override
    public void onClick(View v) {
        //String text1 = m1EditText.getText().toString();
        //String text2 = m2EditText.getText().toString();
        //String text3 = m1TextView.getText().toString();
        //String text4 = m2TextView.getText().toString();

        //float num1 = Float.parseFloat(text1);
        //float num2 = Float.parseFloat(text2);
        //double num1 = Double.parseDouble(text1);
        //double num2 = Double.parseDouble(text2);
        //double but;
        double num1 = new Double(m1EditText.getText().toString());
        double num2 = new Double(m2EditText.getText().toString());
        double but = 0;
        //float but;
        //but = 0;

        if (m1EditText.getText().toString().equals("") && m2EditText.getText().toString().equals("")) {
            Toast.makeText(this, "数字が未入力です", Toast.LENGTH_SHORT).show();
        } else {
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
        //Log.d("ANDROID", "m1TextView is null:" + String.valueOf(m1TextView == null));
        //Log.d("ANDROID", "m1EditView is null:" + String.valueOf(m1EditText == null));
        //Log.d("ANDROID", "m2TextView is null:" + String.valueOf(m2TextView == null));
        //Log.d("ANDROID", "m2EditView is null:" + String.valueOf(m2EditText == null));

        //if (v.getId() == R.id.button1) {
         //   but = num1 + num2;
        //} else if (v.getId() == R.id.button2) {
         //   but = num1 - num2;
        //} else if (v.getId() == R.id.button3) {
         //   but = num1 * num2;
        //} else {
        //    but = num1 / num2;
        //}
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE", but);
        startActivity(intent);
    }
}

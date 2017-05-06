package com.example.a4l3x4nd3r.buttonapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;



public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private Button buttonSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.eT1);
        editText2 = (EditText) findViewById(R.id.eT2);
        buttonSum = (Button) findViewById(R.id.B1);

        buttonSum.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = editText1.getText().toString();
                String value2 = editText2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sum = a + b;
                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });
    }
}

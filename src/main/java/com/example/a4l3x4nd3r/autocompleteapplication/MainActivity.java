package com.example.a4l3x4nd3r.autocompleteapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] language = {"C", "C++", "Java", ".NET", "iPhone", "Android", "ASP.NET", "PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**Creating the instance of ArrayAdapter containing list of languages names*/
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, language);
        /**Getting the instance of AutoCompleteTextView*/
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompTV1);
        actv.setThreshold(1); /**will start working from first character*/
        actv.setAdapter(adapter); /**setting this adapter data into the AutoCompleteTextView*/
        actv.setTextColor(Color.RED);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /**Inflate the menu; this adds items to the action bar if it is present*/
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}

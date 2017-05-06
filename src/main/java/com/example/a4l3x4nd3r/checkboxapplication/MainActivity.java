package com.example.a4l3x4nd3r.checkboxapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    CheckBox pizza, coffee, burger;
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick() {
        /**Getting instance of CheckBoxes and Button from the activity_main.xml file*/
        pizza = (CheckBox) findViewById(R.id.cB1);
        coffee = (CheckBox) findViewById(R.id.cB2);
        burger = (CheckBox) findViewById(R.id.cB3);
        buttonOrder = (Button) findViewById(R.id.B1);

        /**Applying the Listener on the Button click*/
        buttonOrder.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalamount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Items: ");
                if(pizza.isChecked()) {
                    result.append("\nPizza 100Rs");
                    totalamount += 100;
                }
                if(coffee.isChecked()) {
                    result.append("\nCoffee 50Rs");
                    totalamount += 50;
                }
                if(burger.isChecked()) {
                    result.append("\nBurger 120Rs");
                    totalamount += 120;
                }

                result.append("\nTotal: " +totalamount+"Rs");

                /**Displaying the message on the Toast*/
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}

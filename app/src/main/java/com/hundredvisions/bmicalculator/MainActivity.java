package com.hundredvisions.bmicalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Declare programmable UI components here
    EditText edit_feet, edit_inches, edit_pounds;
    Button button_calculate_bmi;
    TextView text_results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect UI elements to elements on content_main
        edit_feet = (EditText) findViewById(R.id.edit_feet);
        edit_inches = (EditText) findViewById(R.id.edit_inches);
        edit_pounds = (EditText) findViewById(R.id.edit_pounds);
        button_calculate_bmi = (Button) findViewById(R.id.button_calculate_bmi);
        text_results = (TextView) findViewById(R.id.text_results);

        // Create a click listener with our button
        button_calculate_bmi.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                String results = "Results: ";
                int feet;
                // Check to make sure feet, inches, & pounds are set
                String str_feet;
                str_feet = edit_feet.getText().toString();
                /*if (Model.isEmpty(str_feet)) {
                    results = "Feet is empty";
                }
                else {
                    results = "Feet is not empty";
                }*/
                try {
                    feet = (Model.validateFeet(str_feet));
                }
                catch (IllegalArgumentException iae) {
                    results = iae.getMessage();
                }
/*                if (edit_feet.getText().length() == 0) {
                    edit_feet.setError("Please enter a #.");
                    results += "Oops! There was an error. ";
                }
                else if (edit_feet.getText().length() > 1) {
                    edit_feet.setError("Too many digits");
                    results += "Our records indicate that you cannot possibly" +
                            " be that tall. ";
                }
                else {
                    results += "The length of feet is: " +
                            edit_feet.getText().length();
                }*/
                text_results.setText(results);
            }
        });

    }

}

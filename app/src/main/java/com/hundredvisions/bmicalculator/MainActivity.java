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
                // Check to make sure feet, inches, & pounds are set
                if (Model.isValidInches(edit_inches))
                {
                    results += "Inches is valid.";
                    int inches = Integer.parseInt(edit_inches.getText().toString());
                    results += " Inches: " + inches;
                }
                else {
                    results += "Inches is not valid";
                }
                if (Model.isValidPounds(edit_pounds)) {
                    results += "\nPounds is valid";
                }
                else {
                    results += "\nPounds is NOT valid";
                }

                text_results.setText(results);
            }
        });

    }

}

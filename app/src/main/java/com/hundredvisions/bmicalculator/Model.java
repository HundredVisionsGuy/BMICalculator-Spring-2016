package com.hundredvisions.bmicalculator;

import android.widget.EditText;

/**
 * Created by winikkc on 4/27/2016.
 */
public class Model {
    private static int lowerFeetRange = 3;
    private static int upperFeetRange = 9;
    private static int lowerInchesRange = 0;
    private static int upperInchesRange = 11;
    private static int lowerPoundsRange = 91;
    private static int upperPoundsRange = 443;

    // Validate Feet
    static boolean isValidFeet(EditText field) {
        // Check if empty
        if (isEmpty(field)) {
            field.setError("Feet is empty;");
            return false;
        }
        // Try to parse the field
        try {
            int data = Integer.parseInt(field.getText().toString());
            if (isInRange(data, lowerFeetRange, upperFeetRange)) {
                return true;
            }
            else {
                field.setError("Feet must be between " + lowerFeetRange +
                        " & " + upperFeetRange + ".");
                return false;
            }
        }
        catch (Exception e) {
            field.setError("Enter feet as numbers (not characters)");
            return false;
        }
    }
    // Validate Inches
    static boolean isValidInches(EditText field) {
        if (isEmpty(field)) {
            field.setText("0");
            return true;
        }
        try {
            int data = Integer.parseInt(field.getText().toString());
            if (isInRange(data, lowerInchesRange, upperInchesRange)) {
                return true;
            }
            else {
                field.setError("Inches must be between " +
                        lowerInchesRange + " & " + upperInchesRange + ".");
                return false;
            }
        }
        catch (Exception e) {
            field.setError("Enter inches as numbers (not characters)");
            return false;
        }
    }
    // Validate Pounds
    static boolean isValidPounds(EditText field) {
        // Check if empty
        if (isEmpty(field)) {
            field.setError("Pounds is empty;");
            return false;
        }
        // Try to parse the field
        try {
            int data = Integer.parseInt(field.getText().toString());
            if (isInRange(data, lowerPoundsRange, upperPoundsRange)) {
                return true;
            }
            else {
                field.setError("Pounds must be between " + lowerPoundsRange +
                        " & " + upperPoundsRange + ".");
                return false;
            }
        }
        catch (Exception e) {
            field.setError("Enter pounds as numbers (not characters)");
            return false;
        }
    }
    // Form Validation
    static boolean isEmpty(EditText field) {
        if (field.getText().length() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    static boolean isInRange(int data, int lower, int upper) {
        if (data >= lower && data <= upper) {
            return true;
        }
        else {
            return false;
        }
    }
}

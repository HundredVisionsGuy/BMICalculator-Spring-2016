package com.hundredvisions.bmicalculator;

import android.widget.EditText;

/**
 * Created by winikkc on 4/21/2016.
 */
public class Model {
    // Range variables
    private static int lowerFeetRange = 3;
    private static int upperFeetRange = 8;
    private static int lowerInchesRange = 0;
    private static int upperInchesRange = 11;
    private static int lowerPoundRange = 91;
    private static int upperPoundRange = 443;

    // Form validation methods
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
    static boolean isValidFeet(EditText field) {
        if (isEmpty(field)) {
            return false;
        }
        else {
            // Try to parse the field (see if can be converted to an int)
            try {
                int data = Integer.parseInt(field.getText().toString());
                if (isInRange(data, lowerFeetRange, upperFeetRange)) {
                    return true;
                }
                else {
                    return false;
                }
            }
            catch (Exception e) {
                return false;
            }
        }
    }
}

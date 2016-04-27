package com.hundredvisions.bmicalculator;

import android.widget.EditText;

/**
 * Created by winikkc on 4/27/2016.
 */
public class Model {
    private static int lowerFeetRange = 3;
    private static int upperFeetRange = 9;

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

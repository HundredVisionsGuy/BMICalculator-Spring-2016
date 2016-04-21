package com.hundredvisions.bmicalculator;

import android.widget.EditText;

/**
 * Created by winikkc on 4/21/2016.
 */
public class Model {
    // Form validation methods
    static boolean isEmpty(EditText field) {
        if (field.getText().length() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    static void checkRange(String fieldname, EditText field, int lower, int upper) {
        int data = Integer.parseInt(field.getText().toString());
        if (data < lower || data > upper) {
            String msg = "\n" + fieldname + " is out of range (must be between " +
                    lower + " & " + upper + ")!";
            throw new IllegalArgumentException(msg);
        }
    }
/*    static int convertStringInt(EditText field) {
        int output;
        output = Integer.parseInt(field.getText().toString());
        return output;
    }*/
}

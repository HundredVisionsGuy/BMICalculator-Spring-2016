package com.hundredvisions.bmicalculator;

/**
 * Created by winikkc on 4/15/2016.
 */
public class Model {
    static void checkRange(String field, int data, int lower, int upper ) {
        if (data < lower || data > upper) {
            throw new IllegalArgumentException(field + " is out of range (" + lower +
            "..." + upper + ")!");
        }
    }
    static boolean isEmpty(String field) {
        boolean results = false;
        if (field.isEmpty()) {
            results = true;
        }
        return  results;
    }
    /* Check a field for validity
    *   Is it empty?
    *   If it's a number, can we parse it to the right data type?
    *   Is it within range?
    * */
    static int validateFeet(String str_feet) {
        int feet = 0;
        // Is it empty?
        if (isEmpty(str_feet)) {
            throw new IllegalArgumentException("You left the feet field blank.");
        }
        try {
            feet = Integer.parseInt(str_feet);
        }
        catch (Exception ex) {
        }
        checkRange(str_feet, feet, 3, 10);
        return feet;
    }
}

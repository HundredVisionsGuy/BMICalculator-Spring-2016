package com.hundredvisions.bmicalculator;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by winikkc on 5/3/2016.
 */
public class JsonUtil {
    public static String toJson(User user) {
        try {
            // Convert User object to JSON
            JSONObject jsonObj = new JSONObject();
            jsonObj.put("name", user.getFirstName());
            jsonObj.put("last name", user.getLastName());
            return jsonObj.toString();
        }
        catch (JSONException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}

package com.example;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Created by ravi on 5/2/2017.
 */
public class JsonObj {

    public static void main(String[] args) {

        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();

        jsonArray.add("2");
        jsonArray.add("3");

        jsonObject.add("layergroup", jsonArray );
        System.out.println(jsonObject);

    }
}
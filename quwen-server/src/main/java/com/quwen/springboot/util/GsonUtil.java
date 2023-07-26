package com.quwen.springboot.util;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class GsonUtil {

    public static Gson gson;

    static {
        gson = new Gson();
    }

    public static JsonElement toJsonTree(Object object){
        return gson.toJsonTree(object);
    }
}

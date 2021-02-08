package info.app.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonDisplay {

    public static String toJson(Object object) {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(object);
    }

}

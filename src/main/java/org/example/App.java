package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {

    public static void main(String[] args) {

        User user = new User("Yurii", "Dyma");

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(user);
        System.out.println("json = " + json);

    }
}

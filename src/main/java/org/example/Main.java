package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.user.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Artem","Abramov");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(user);
        System.out.println(json);
    }
}
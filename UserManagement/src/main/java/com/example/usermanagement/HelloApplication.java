package com.example.usermanagement;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.Response;

@ApplicationPath("/api")
public class HelloApplication extends Application {

    public static void main(String[] args) {
        User user = new User("name", "lastName", 25,"username", "password");

        System.out.println(user.getCreated());
    }
}
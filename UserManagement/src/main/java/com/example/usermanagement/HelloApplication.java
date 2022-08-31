package com.example.usermanagement;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class HelloApplication extends Application {

    public static void main(String[] args) {
        User user = new User("name", "lastName", 25,"username", "password");
    }
}
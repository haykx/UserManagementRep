package com.example.usermanagement;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationPath("/api")
@Produces(MediaType.APPLICATION_JSON)
public class HelloApplication extends Application {

    public static void main(String[] args) {

        System.out.println(HelloResource.hello());
//        User user = new User("name", "lastName", 25,"username", "password");
//
//        System.out.println(user.getCreated());
    }
}